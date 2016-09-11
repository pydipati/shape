package com.challenge.shape;

/**
* <h1>This is super shape interface to support Triangle</h1>
* <b>Note:</b> 
* This is shape interface which supports all triangle types, all rectangles types and ellipse types (circle & ellipse)
* <p>
*  
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public interface Shape {

	public Enum<ShapeTypes> getShapeType();
	public double getArea();
	public double getCircumference();

}
