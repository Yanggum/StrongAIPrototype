package com.tia.main.vo;

import java.util.ArrayList;

public class LoveObjectList {
	private ArrayList<LoveObject> list;

	
	public LoveObjectList() {
		
	}
	
	public LoveObjectList(ArrayList<LoveObject> list) {
		this.list = list;
	}
	
	
	public ArrayList<LoveObject> getList() {
		return list;
	}

	public void setList(ArrayList<LoveObject> list) {
		this.list = list;
	}
}
