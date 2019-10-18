package com.tia.main;

public class LoveTranslator {
	public static final int ALL_HANGUL_LENGTH = '힣'-'가';
	public static final int ALL_MARKS = 6;
	
	
	public static String getHangul(int i) {		
		String result = "";
		String hanguls = getHangulSet();
		
		result += hanguls.charAt(i);
				
		return result;
	}
	
	
	
	
	private static String getHangulSet() {
		String result = " ";    	
    	
    	for (int i='가';i<='힣' ;i++) {
    		result += (char)i;
    	}
    	
    	return result;
	}
	
	public static String getMarks() {
		String result = ".,?!'\"";		
		return result;
	}

}
