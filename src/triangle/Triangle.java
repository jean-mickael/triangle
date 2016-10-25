package triangle;

public class Triangle {
	
	private int x, y, z;
	
	public enum TriangleType {
		SCALENE,
		ISOSCELES,
		EQUILATERAL;
	}
	
	public Triangle(int x, int y, int z) {
		if (x<=0 || y<=0 || z<=0) {
			throw new IllegalArgumentException("All the sides have to be greater than zero.");
		}
		if ((x > y+z) || (y > x+z) || (z > x + y)) {
			throw new IllegalArgumentException("One side cannot be greater than the sum of the two others.");
		}
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * Returns true if the triangle is equilateral, all three sides are equal.
	 * @return a boolean true if the triangle is equilateral, false otherwise
	 */
	public final boolean isEquilateral() {
		return (x == y && x == z);
	}
	
	/**
	 * Returns true if the triangle is isosceles, two of the three sides are equal.
	 * @return a boolean true if the triangle is isosceles, false otherwise
	 */
	public final boolean isIsosceles() {
		return (x == y && x != z) || (x == z && x != y);
	}
	
	/**
	 * Returns true if the triangle is scalene, the three sides are unequal.
	 * @return a boolean true if the triangle is scalene, false otherwise
	 */
	public final boolean isScalene() {
		return (x != y && x != z && y != z);
	}
	
	/**
	 * Returns the type of the triangle.
	 * @return the {@link TriangleType}
	 */
	public TriangleType getType() {
		if (isIsosceles()) {
			return TriangleType.ISOSCELES;
		}
		if (isEquilateral()) {
			return TriangleType.EQUILATERAL;
		}
		return TriangleType.SCALENE;
	}
}
