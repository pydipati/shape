package com.challenge.shape.triangle;

/**
* <h1>This is class for Isosceles Triangle</h1>
*  
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public class IsoscelesTriangle extends Triangle {

	public IsoscelesTriangle(double[] sides) {
		super.sides = sides;
	}

	@Override
	public TriangleTypes getTriangleType() {
		return TriangleTypes.ISOSCELES;
	}

}
