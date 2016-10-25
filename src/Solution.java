import java.util.Scanner;

import triangle.Triangle;

public class Solution {

	public static void main(String[] args) {
		System.out.println("Please enter the 3 sides separated by spaces.");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt(); 
		int y = scan.nextInt(); 
		int z = scan.nextInt(); 
		scan.close();
		Triangle triangle = new Triangle(x,y,z);
		System.out.print("This triangle is "+triangle.getType());
    }
}
