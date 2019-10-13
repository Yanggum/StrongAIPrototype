package com.tia.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Input 정의
    	String[][] test = new String[][] {{"1", "1", "2"}, {"2", "3", "5"}, {"3", "6", "9"} };    	
    	
    	int result = testRecusrsion(1);
        System.out.println( "Hello World! = " + result);
        
    	while(true) {
    		
    		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    		
    		String input = "";

    		try {
				input = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		if (input.equals("q"))
    			break;
    		else {
    			System.out.println(input);
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
