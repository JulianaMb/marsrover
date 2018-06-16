package com.juliana.marsrover.model;

import org.junit.Test;

import com.juliana.marsrover.useful.Direction;

import org.junit.Assert;


public class MarsRoverTest {
	
	@Test
	public void canRotateLeft(){
		Plateau plateau = new Plateau(5, 5);
		Position position = new Position(1, 2, Direction.N);
		MarsRover rover = new MarsRover(plateau, position);
		
		rover.rotateLeft();
		Assert.assertEquals("1 2 W", rover.getPosition().toString());
	}
	
	@Test
	public void canRotateRight(){
		Plateau plateau = new Plateau(5, 5);
		Position position = new Position(1, 2, Direction.N);
		MarsRover rover = new MarsRover(plateau, position);
		
		rover.rotateRight();
		Assert.assertEquals("1 2 E", rover.getPosition().toString());		
	}
	
	@Test
	public void canMoveToValidPosition(){
		Plateau plateau = new Plateau(5, 5);
		Position position = new Position(1, 2, Direction.N);
		MarsRover rover = new MarsRover(plateau, position);		
		
		rover.moveForward();
		Assert.assertEquals("1 3 N", rover.getPosition().toString());		
	}	
	
	/****
	 * If the rover tries to make a move outside plateau boundaries it remains in the last valid position
	 */
	@Test
	public void cantMoveToInvalidPosition(){
		Plateau plateau = new Plateau(5, 5);
		Position position = new Position(1, 2, Direction.N);
		MarsRover rover = new MarsRover(plateau, position);		
		rover.rotateLeft();
		rover.moveForward();
		rover.moveForward();
		Assert.assertEquals("0 2 W", rover.getPosition().toString());		
	}	
	
	@Test
	public void canRunSeveralCommands(){
		Plateau plateau = new Plateau(5, 5);
		Position position = new Position(1, 2, Direction.N);
		MarsRover rover = new MarsRover(plateau, position);		
		rover.run("LMLMLMLMM");

		Assert.assertEquals("1 3 N", rover.getPosition().toString());			
	}

}
