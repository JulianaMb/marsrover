package com.juliana.marsrover.model;

import com.juliana.marsrover.useful.Direction;

/**
 * MarsRover represents a rover that can run on Mars
 * 
 * Properties:
 * Plateau: environment that rover drives
 * Position: current position, represented by x, y coordinates and a direction (N, S, E, W)
 * 
 * Rover can:
 * rotateLeft()
 * rotateRight()
 * moveForward()
 * @author Juliana
 *
 */
public class MarsRover {	
	
	private Plateau plateau;
	private Position position;
	
	
	public MarsRover(Plateau plateau, Position position){
		this.plateau = plateau;
		this.position = position;
	}
	
	/**
	 * MarsRover can spin 90 degrees left  
	 */
	public void rotateLeft(){
		this.position.setDirection(Direction.byValue((position.getDirection().value-1)<Direction.N.value?Direction.W.value:(position.getDirection().value-1)));
	}
	
	/**
	 * MarsRover can spin 90 degrees right  
	 */	
	public void rotateRight(){
		this.position.setDirection(Direction.byValue((position.getDirection().value+1)>Direction.W.value?Direction.N.value:(position.getDirection().value+1)));
	}
	
	/****
	 * rover can move forward one grid point, and maintain the same heading
	 * If the rover tries to make a move outside plateau boundaries it remains in the last valid position
	 */	
	public void moveForward() {
		int move;
		if (position.getDirection().equals(Direction.N)) {
			move = position.getY()+1;
			if (plateau.insideBoundaries(position.getX(), move)){
				position.setY(move);
			}
			
		} else if (position.getDirection().equals(Direction.E)) {
			move = position.getX()+1;
			if (plateau.insideBoundaries(move, position.getY())){
				position.setX(move);
			}
			
		} else if (position.getDirection().equals(Direction.S)) {
			move = position.getY()-1;
			if (plateau.insideBoundaries(position.getX(), move)){
				position.setY(move);
			}
			
		} else if (position.getDirection().equals(Direction.W)) {
			move = position.getX()-1;
			if (plateau.insideBoundaries(move, position.getY())){
				position.setX(move);
			}
			
		}
	}	
	
	/**
	 * Run rover according to the commands (L left, R right and M move forward)
	 * @param commands
	 */
	public void run(String commands){
		
		for (int i = 0; i < commands.length(); i++  ) {
			if (commands.charAt(i)=='L'){
				rotateLeft();
			}else if (commands.charAt(i)=='R'){
				rotateRight();
			}else if (commands.charAt(i)=='M'){
				moveForward();
			}
		}		
	}
	
	/**
	 * Current rover position
	 * @return Position
	 */
	public Position getPosition(){
		return position;
	}

}
