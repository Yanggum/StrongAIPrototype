package com.tia.main.operation;

import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Naelim {
	private static CircularFifoQueue<String> s;
	
	static {
		s = new CircularFifoQueue<String>();
	}
	
	
	
	public static double getRandomCalculatedNum(double one, double two) {
		String operator = Olim.getRandomizedOperator();
		double result = 0;
		
		switch (operator) {
			case "+":
				result = one + two;
				break;
			case "-":
				result = one - two;				
				break;
			case "*":
				result = one * two;
				break;
			case "/":
				if (two != 0)
					result = one / two;				
				else
					result = one / 1;
				break;		
		}
		
		return result;
	}
	
	public static boolean fit(double one, double answer) {

		if (one == answer)
			return true;
		else {
			s.add(Double.toString(one));			
			return false;
		}
		
		
	}
}
