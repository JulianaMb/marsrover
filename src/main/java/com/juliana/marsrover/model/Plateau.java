package com.juliana.marsrover.model;

public class Plateau {
	
	private int lowerLeftX = 0;
	private int lowerLefty = 0;
	private int upperRightX;
	private int upperRightY;
	
	public Plateau(int upperRightX, int upperRightY){
		this.upperRightX = upperRightX;
		this.upperRightY = upperRightY;
	}

	public int getLowerLeftX() {
		return lowerLeftX;
	}

	public void setLowerLeftX(int lowerLeftX) {
		this.lowerLeftX = lowerLeftX;
	}

	public int getLowerLefty() {
		return lowerLefty;
	}

	public void setLowerLefty(int lowerLefty) {
		this.lowerLefty = lowerLefty;
	}

	public int getUpperRightX() {
		return upperRightX;
	}

	public void setUpperRightX(int upperRightX) {
		this.upperRightX = upperRightX;
	}

	public int getUpperRightY() {
		return upperRightY;
	}

	public void setUpperRightY(int upperRightY) {
		this.upperRightY = upperRightY;
	}
	
	public boolean insideBoundaries(int x, int y){
		return (x >= lowerLeftX && y >= lowerLefty) && (x <= upperRightX && y <= upperRightY);
	}

}