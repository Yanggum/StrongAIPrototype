package com.tia.main;

import java.util.Random;

import com.tia.main.vo.UndefinedObjectList;

public class UndefinedCalculator {
	private UndefinedObjectList uol;
	private Random rand;
	
	public UndefinedCalculator() {
		rand = new Random(System.currentTimeMillis());
	}
	
	public void updateRandomSeed() {
		rand.setSeed(System.currentTimeMillis());
	}
	

}
