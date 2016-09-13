package com.challenge.shape.util;

/**
* <h1>This is validator class which has validations for all types of shapes</h1>
*  
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public class ShapeValidator {

	public static Boolean isAnySideZero(double a, double b, double c) {
		return a <= 0 || b <= 0 || c <= 0;
	}

	public static Boolean isTriangle(double[] t) {
		return t[2] < t[0] + t[1] && t[1] < t[0] + t[2]  && t[0] < t[1] + t[2] ;
	}
	
	public static Boolean isNotRectangle(double[] t) {
		throw new IllegalArgumentException("Not implemented");
	}

}
