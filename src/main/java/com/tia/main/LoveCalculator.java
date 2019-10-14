package com.tia.main;

import java.util.ArrayList;
import java.util.Random;

import com.tia.main.vo.LoveObject;
import com.tia.main.vo.LoveObjectList;
import com.tia.main.vo.SeperatedLoveObject;

public class LoveCalculator {
	private LoveObjectList uol;
	private static Random rand = new Random(System.currentTimeMillis());	
	
	public static void updateRandomSeed() {
		rand.setSeed(System.currentTimeMillis());
	}
	
	public static SeperatedLoveObject Seperate(LoveObject uo, int count) {		
		SeperatedLoveObject result = new SeperatedLoveObject();		
		
		for (int i=0;i<count;i++) {
			LoveObject element = new LoveObject();
			element.setValue(uo.getValue()/count);		
			result.getSeperated().add(element);			
		}
		
		return result;
	}	
	
	public static LoveObject Merge(SeperatedLoveObject uso) {
		LoveObject result = new LoveObject();
		ArrayList<LoveObject> usos = uso.getSeperated();
		double sum = 0;
		
		for (int i=0; i<usos.size() ;i++) {
			sum += usos.get(i).getValue();
		}
		
		result.setValue(sum);
		
		return result;
	}
	
	public static LoveObject Mix(SeperatedLoveObject uso1, SeperatedLoveObject uso2) {
		ArrayList<LoveObject> usoOneArr = uso1.getSeperated();
		ArrayList<LoveObject> usoTwoArr = uso2.getSeperated();
		
		int size = usoOneArr.size() > usoTwoArr.size() ? usoOneArr.size() : usoTwoArr.size();
		
		for (int i=0;i<size;i++) {
			
		}
				
		return null;
	}
	
	
	public static LoveObject UndefinedOperate(LoveObject uo1, LoveObject uo2)
	{
		LoveObject result = new LoveObject();		
		result.setValue(randCalculate(uo1.getValue(), uo2.getValue()));
		return result;
	}
	
	private static double randCalculate(double opernd1, double opernd2) {
		double result = 0;		
		updateRandomSeed();		
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