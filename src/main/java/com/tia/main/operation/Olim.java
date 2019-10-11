package com.tia.main.operation;

import java.util.Random;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Olim {
	private CircularFifoQueue<String> s;
	
	public static String getRandomizedOperator() {		
		Random rand = new Random();
		rand.setSeed(System.currentTimeMillis());
		
		int calculated =  rand.nextInt() % 4;
		
		
		switch (calculated) {
			case 0:
				return "+";
			case 1:
				return "-";
			case 2:
				return "*";
			case 3: 
				return "/";
			default:
				return "+";
		}		
	}	
		
}
