package com.tia.main;

import java.util.ArrayList;
import java.util.Random;

import com.tia.main.vo.LoveObject;
import com.tia.main.vo.SeperatedLoveObject;

public class LoveCalculator {
	private static final int MAX_COUNT_SIZE = 100;
	private static Random rand = new Random(System.currentTimeMillis());	
	
	private static void updateRandomSeed() {
		rand.setSeed(System.currentTimeMillis());
	}
	
	private static LoveObject generate() {
		LoveObject lo = new LoveObject();
		lo.setValue(rand.nextDouble());
		
		return lo;		
	}
	
	public static double run() {
		LoveObject lo = LoveCalculator.generate();
		
		double result = 0;
		
		while (result == 0) {		
			result = Merge(Mix(Seperate(lo))).getValue()/MAX_COUNT_SIZE;
		}		
		
		return result;
		
	}
	
	private static SeperatedLoveObject Seperate(LoveObject uo) {		
		int count = getSepCount();
		SeperatedLoveObject result = new SeperatedLoveObject();		
		
		for (int i=0;i<count;i++) {
			LoveObject element = new LoveObject();
			element.setValue(uo.getValue()/count);		
			result.getSeperated().add(element);			
		}
		
		return result;
	}	
	
	private static LoveObject Merge(SeperatedLoveObject uso) {
		LoveObject result = new LoveObject();
		ArrayList<LoveObject> usos = uso.getSeperated();
		double sum = 0;
		
		for (int i=0; i<usos.size() ;i++) {
			sum += usos.get(i).getValue();
		}
		
		result.setValue(sum);
		
		return result;
	}
	
	private static SeperatedLoveObject Mix(SeperatedLoveObject uso) {
		ArrayList<LoveObject> usoArr = uso.getSeperated();
		SeperatedLoveObject result = new SeperatedLoveObject();
		ArrayList<LoveObject> resultArr = result.getSeperated();
		int count = getSepCount();		
		int usoCount = usoArr.size();
		
		if (usoCount > 0) {
			for (int i=0;i<count;i++) {
				int idxOne = getSepCount()%usoCount;
				int idxTwo = getSepCount()%usoCount;			
				resultArr.add(UndefinedOperate(usoArr.get(idxOne), usoArr.get(idxTwo)));
			}
		}
		
				
		return result;
	}
	
	
	private static LoveObject UndefinedOperate(LoveObject uo1, LoveObject uo2)
	{
		LoveObject result = new LoveObject();		
		result.setValue(randCalculate(uo1.getValue(), uo2.getValue()));
		return result;
	}
	
	private static int getSepCount() {
		int count = 0;
		
		while(true) {
			count = rand.nextInt();
			
			if (count >= 2) {
				break;
			}
		}
		
		return count%MAX_COUNT_SIZE;
	}
	
	private static double randCalculate(double opernd1, double opernd2) {
		double result = 0;		
		int operator = (int)(rand.nextLong() % 4);
		
		switch (operator) {
			case 0:
				result = opernd1 + opernd2;
				break;
			case 1:
				result = opernd1 - opernd2;				
				break;
			case 2:
				result = opernd1 * opernd2;				
				break;
			case 3:
				if (opernd2 != 0)				
					result = opernd1 / opernd2;				
				else
					result = opernd1 / 1;									
				break;
		}
				
		return result;
	}

}
