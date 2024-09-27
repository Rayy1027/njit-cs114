package tester;

import polynomial.Polynomial;

public class tester {

	public static void main(String[] args) {
		System.out.println("Test cases for Hw2 - Polynomials:\n");
		// Create some polynomials
		Polynomial p1 = new Polynomial(new int[] {-7,3,-1,5});
		Polynomial p2 = new Polynomial(new int[] {0,-2,0,0,1});
		Polynomial p3 = new Polynomial(new int[] {9,0,0,-2});
		Polynomial p4 = new Polynomial(new int[] {-1,2,0,0,0});
		Polynomial p5 = new Polynomial(new int[] {0,0,0,0,0,0,0,5});
		Polynomial p6 = new Polynomial(new int[] {-2});
		Polynomial p7 = new Polynomial(new int[] {0,0,0,0});
		Polynomial p8 = new Polynomial(new int[] {0,6,0,0});
		
		// Print polynomials using the toString overloaded method
		System.out.println(String.format("p1 is the polynomial: %s ,  degree %s", p1, p1.getDegree()));
		System.out.println(String.format("p2 is the polynomial: %s ,  degree %s", p2, p2.getDegree()));
		System.out.println(String.format("p3 is the polynomial: %s ,  degree %s", p3, p3.getDegree()));
		System.out.println(String.format("p4 is the polynomial: %s ,  degree %s", p4, p4.getDegree()));
		System.out.println(String.format("p5 is the polynomial: %s ,  degree %s", p5, p5.getDegree()));
		System.out.println(String.format("p6 is the polynomial: %s ,  degree %s", p6, p6.getDegree()));
		System.out.println(String.format("p7 is the polynomial: %s ,  degree %s", p7, p7.getDegree()));
		System.out.println(String.format("p8 is the polynomial: %s ,  degree %s", p8, p8.getDegree()));
		
		System.out.println();
		// Example of addition
		System.out.println("Add p2 to p1:");
		p1.add(p2);
		System.out.println("p1 is now: " + p1 + " , degree: " + p1.getDegree());
		System.out.println("p2 is the same: " + p2);
		System.out.println();
		
		System.out.println("Add p8 to p6:");
		p6.add(p8);
		System.out.println("p6 is now: " + p6 + " , degree: " + p6.getDegree());
		System.out.println("p8 is the same: " + p8);
		System.out.println();
		
		// Example of subtraction
		System.out.println("Subtract p3 from p1:");
		p1.subtract(p3);
		System.out.println("p1 is now: " + p1+ " , degree: " + p1.getDegree());
		System.out.println("p3 is the same: " + p3);
		System.out.println();
		
		System.out.println("Subtract p3 from p2:");
		p2.subtract(p3);
		System.out.println("p2 is now: " + p2+ " , degree: " + p2.getDegree());
		System.out.println("p3 is the same: " + p3);
		System.out.println();
		
		// Return the derivative
		System.out.println("The derivative of p3 is: " + p3.getDerivative());
		System.out.println("p3 is the same: " + p3);
		System.out.println();
		
		// Eval at point
		System.out.println("The value of p4(5) is: " + p4.atPoint(5));
		System.out.println("The value of p1(1) is: " + p1.atPoint(1));
		System.out.println();
		
		// Cannot change the polynomial from outside 
		int[] myCoef = new int[] {1,1,1,1};
		Polynomial q = new Polynomial(myCoef);
		System.out.println("q is the polynomial: " +  q);
		myCoef[2] = 23;
		System.out.println("q is the same: " +  q);
		
	}

}
