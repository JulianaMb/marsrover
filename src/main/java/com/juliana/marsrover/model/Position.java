package com.juliana.marsrover.model;

import com.juliana.marsrover.useful.Direction;

/**
 * Position represents rover position on Plateau
 * Properties:
 * x : x coordinate
 * y : y coordinate
 * Direction : N, S, E, W  
 * @author Juliana
 *
 */
public class Position {
	private int x;
	private int y;
	private Direction direction;
	
	public Position(int x, int y, Direction direction){
		this.x = x;
		this.y = y;
		this.direction = direction;
	}
	
	/**
	 * x coordinate
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Define x coordinate
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * y coordinate
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Define y coordinate
	 * @param y
	 */	
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Direction 
	 * @return Direction
	 */
	public Direction getDirection() {
		return direction;
	}

	public void setDirection(Direction direction) {
		this.direction = direction;
	}		
	
	@Override
	public String toString(){
		return String.valueOf(getX()) + " "+ String.valueOf(getY())+" "+ String.valueOf(getDirection());
	}
	
	

}