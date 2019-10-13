package com.tia.main.vo;

import java.util.ArrayList;

public class UndefinedObjectList {
	private ArrayList<UndefinedObject> list;

	
	public UndefinedObjectList() {
		
	}
	
	public UndefinedObjectList(ArrayList<UndefinedObject> list) {
		this.list = list;
	}
	
	
	public ArrayList<UndefinedObject> getList() {
		return list;
	}

	public void setList(ArrayList<UndefinedObject> list) {
		this.list = list;
	}
}
