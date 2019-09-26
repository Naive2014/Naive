package com.Naive;

import java.util.Scanner;

/**
 * 
 * @author Naive
 *
 */

public class Test {
	public static void main(String[] args){
		while(true){
			@SuppressWarnings("resource")
			Scanner sa = new Scanner(System.in);
			
			double rad = sa.nextDouble();
			final double PI = 3.1415926;
			double area = PI*rad*rad;
			System.out.println(area);
		}
		
	}
}
