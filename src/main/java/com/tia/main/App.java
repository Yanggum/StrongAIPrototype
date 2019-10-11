package com.tia.main;

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
    	
    	for (int i=0;i<test.length;i++) {
    		for (int j=0;j<test[i].length;j++) {
    			
    			
    			
    			
    			System.out.print(" " + test[i][j]);
    		}
    		System.out.println();
    	}
    	
    	
    	
        System.out.println( "Hello World!" );
    }
}
