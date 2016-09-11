package com.challenge.shape.triangle;

/**
* <h1>This is class for Scalene Triangle</h1>
*  
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public class ScaleneTriangle extends Triangle {

	public ScaleneTriangle(double[] sides) {
		super.sides = sides;
	}

	@Override
	public TriangleTypes getTriangleType() {
		return TriangleTypes.SCALENE;
	}
}
