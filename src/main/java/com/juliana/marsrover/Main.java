package com.juliana.marsrover;

import java.util.Scanner;

import com.juliana.marsrover.model.MarsRover;
import com.juliana.marsrover.model.Plateau;
import com.juliana.marsrover.model.Position;
import com.juliana.marsrover.useful.Direction;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		System.out.println("Plateau Size x, y:");
		int x = scan.nextInt();
		int y = scan.nextInt();
		int endx = 0;
		int endy = 0;
		String direction = "";
		boolean validDirection = true;
		do{
			try{
				System.out.println("Initial rover position x, y, Direction (N, S, E, W):");
				endx = scan.nextInt();				
				endy = scan.nextInt();
				direction = scan.next();
				if (Direction.valueOf(direction)!=null){
					validDirection = true;
				}
			}catch (IllegalArgumentException e){
				validDirection = false;
			}
		
		} while (!validDirection);

		Plateau plateau = new Plateau(x, y);
		Direction d = Direction.valueOf(direction);
		Position position = new Position(endx, endy, d);
		if (!plateau.insideBoundaries(endx, endy)){
			System.out.println("Coordinates are outside plateau boundaries, redefined to 0,0");
			position.setX(0);
			position.setY(0);
		}		
		
		System.out.println("Type a line with the rover commands:");
		String commands = scan.next();	


		MarsRover r = new MarsRover(plateau, position);
		r.run(commands);
		System.out.println(r.getPosition().toString());
		scan.close();		

	}

}