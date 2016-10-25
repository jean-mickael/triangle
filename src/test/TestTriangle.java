package test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import triangle.Triangle;

public class TestTriangle {

	@Test (expected = IllegalArgumentException.class)
	public void testNegativeSide() {
	    Triangle triangle = new Triangle(-1,1,1);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testOneSideBiggerThanTwoOthers() {
	    Triangle triangle = new Triangle(1,1,3);
	}
	
	@Test 
	public void testScalene() {
	    Triangle triangle = new Triangle(1,3,4);
	    assertEquals(triangle.getType(), Triangle.TriangleType.SCALENE);
	}
	
	@Test 
	public void testIsosceles() {
	    Triangle triangle = new Triangle(3,3,4);
	    assertEquals(triangle.getType(), Triangle.TriangleType.ISOSCELES);
	}
	
	@Test 
	public void testEquilateral() {
	    Triangle triangle = new Triangle(1,1,1);
	    assertEquals(triangle.getType(), Triangle.TriangleType.EQUILATERAL);
	}

}
