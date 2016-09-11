package com.challenge.shape.triangle;

import com.challenge.shape.Shape;
import com.challenge.shape.ShapeTypes;

/**
* <h1>This is Triangle abstract class which has subclasses a) EquilateralTriangle b)IsoscelesTriangle c)ScaleneTriangle</h1>
*  This class supports generic functions related to all types of triangles such as area, circumference..etc
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public abstract class Triangle implements Shape {

	// future use
	protected double[] sides;

	public Enum<ShapeTypes> getShapeType() {
		return ShapeTypes.TRIANGLE;
	}

	public double getArea() {
		// calculation todo
		return 0;
	}

	public double getCircumference() {
		// calculation todo
		return 0;
	}

	public abstract TriangleTypes getTriangleType();

}
