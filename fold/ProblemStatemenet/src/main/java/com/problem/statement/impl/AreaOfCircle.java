package com.problem.statement.impl;

import java.util.Scanner;

import com.problem.statement.Shape;

public class AreaOfCircle extends Shape{
	
	private double radius;
	private double diameter;

	@Override
	public void calArea() {
		System.out.println("Enter the radius of circle:-");
		Scanner scanner=new Scanner(System.in);
		double rad=scanner.nextDouble();
		setRadius(rad);
		setDiameter(2*10);
		//double radi=getRadius();
	double	 area = 3.14*getRadius()*getRadius();
		System.out.println("Area of circle "+area);
		
		
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	

	
	
}
