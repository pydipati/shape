package com.challenge.shape.triangle;

/**
* <h1>This is class for Equilateral Triangle</h1>
*  
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public class EquilateralTriangle extends Triangle {

	public EquilateralTriangle(double[] sides) {
		super.sides = sides;
	}

	@Override
	public TriangleTypes getTriangleType() {
		return TriangleTypes.EQUILATERAL;
	}

}
