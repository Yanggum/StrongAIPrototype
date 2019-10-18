package com.tia.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Random;

import com.tia.main.vo.LoveObject;
import com.tia.main.vo.SeperatedLoveObject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
    	Random rand = new Random();
    	
    	long timeBuffer = 0;
    	
    	while(true) {    		
//    		timeBuffer = System.currentTimeMillis();
    		
    		if (timeBuffer != System.currentTimeMillis()) {    		
    			System.out.println(LoveCalculator.run());
    			timeBuffer = System.currentTimeMillis();
    		}
    	}
	}
    
    public static int testRecusrsion(int i) {
    	
    	if (i == 10)    	
	    	return i;
    	else
    		return testRecusrsion(i + 1) + i;    	
    }
    
    
}
