package com.tia.main.vo;

import java.util.ArrayList;

public class SeperatedLoveObject {	
	private ArrayList<LoveObject> seperated;
	
	public SeperatedLoveObject() {
		seperated = new ArrayList<LoveObject>();
	}

	public ArrayList<LoveObject> getSeperated() {
		return seperated;
	}

	public void setSeperated(ArrayList<LoveObject> seperated) {
		this.seperated = seperated;
	}
}
