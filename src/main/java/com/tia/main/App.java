package com.tia.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Input 정의
    	String[] test = new String[] {"가"};    	
    	String test2 = new String("가힣");
    	byte[] test3 = test2.getBytes(StandardCharsets.UTF_8);
    	String test4 = "";
		String result = ".,?!'\"";		

    	
    	System.out.println(result.length());
    	
    	
		/*
		 * System.out.println("test3 =" + test3.toString()); System.out.println(a);
		 * System.out.println(b);
		 */    	
    	
//    	int result = testRecusrsion(1);
//        System.out.println( "Hello World! = " + result);
        
        
        
        
        
		/*
		 * while(true) {
		 * 
		 * BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * String input = "";
		 * 
		 * try { input = in.readLine(); } catch (IOException e) { // TODO Auto-generated
		 * catch block e.printStackTrace(); }
		 * 
		 * if (input.equals("q")) break; else { System.out.println(input); }
		 * 
		 * }
		 */    }
    
    public static int testRecusrsion(int i) {
    	
    	if (i == 10)    	
	    	return i;
    	else
    		return testRecusrsion(i + 1) + i;    	
    }
    
    
}
