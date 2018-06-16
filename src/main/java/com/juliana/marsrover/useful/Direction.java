package com.juliana.marsrover.useful;

/**
 * Enum that represents possibles directions that Rover can take
 * N : North
 * S : South
 * E : East
 * W : West
 * @author Juliana
 *
 */
public enum Direction {
	N(1), E(2), S(3), W(4);
	
	public int value;
	Direction(int i){
		value = i;
	}
	
    public static Direction byValue(int i) {
        for (Direction d: Direction.values()) {
            if (i == d.value) return d;
        }
        throw new IllegalArgumentException("invalid Value");
    }	
	
}