package com.juliana.marsrover.model;

import org.junit.Test;

import org.junit.Assert;

public class PlateauTest {

	@Test
	public void isXLowerThanLowerXBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = -1;
		int y = 0;
		
		Assert.assertEquals(false, p.insideBoundaries(x, y));
	}
	
	@Test
	public void isXEqualThanLowerXBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = 0;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}	
	
	@Test
	public void isXGreaterThanLowerXBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 2;
		int y = 0;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}	
	
	@Test
	public void isXLowerThanUpperXBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 4;
		int y = 0;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}
	
	@Test
	public void isXEqualThanUpperXBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 5;
		int y = 0;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}	
	
	@Test
	public void isXGreaterThanUpperXBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 6;
		int y = 0;
		
		Assert.assertEquals(false, p.insideBoundaries(x, y));
	}		
	
	@Test
	public void isYLowerThanLowerYBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = -1;
		
		Assert.assertEquals(false, p.insideBoundaries(x, y));
	}
	
	@Test
	public void isYEqualThanLowerYBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = 0;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}	
	
	@Test
	public void isYGreaterThanLowerYBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = 2;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}	
	
	@Test
	public void isYLowerThanUpperYBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = 1;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}
	
	@Test
	public void isYEqualThanUpperYBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = 5;
		
		Assert.assertEquals(true, p.insideBoundaries(x, y));
	}	
	
	@Test
	public void isYGreaterThanUpperYBoundarie(){
		Plateau p = new Plateau(5,5);
		int x = 0;
		int y = 6;
		
		Assert.assertEquals(false, p.insideBoundaries(x, y));
	}
	
	@Test
	public void isXandYGreaterThanUpperXandYBoundaries(){
		Plateau p = new Plateau(5,5);
		int x = 6;
		int y = 6;
		
		Assert.assertEquals(false, p.insideBoundaries(x, y));
	} 
}
