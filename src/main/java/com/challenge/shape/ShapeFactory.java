package com.challenge.shape;

/**
* <h1>This is abstract factory class that gives back appropriate Shape back</h1>
*  
*
* @author  Karuna P
* @version 1.0
* @since   2016-09-10 
*/
public abstract class ShapeFactory {


	/**
	 * This is abstract method which gives back Shape, given arguments.
	 * 
	 * @param args   	  variable number of params (3 argumanets are needed for triangle, 2 arguments are needed for rectangle...etc)
	 *
	 */
	public abstract Shape getShape(double ... args);

	
	
}
