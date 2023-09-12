package com.problem.statement.impl;

import java.util.Scanner;

import com.problem.statement.Shape;

public class AreaOfRectAngle extends Shape{
	private int length;
	private int width;
	

	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	@Override
	public void calArea() {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter length of rectangle:-");
	 	int len=scanner.nextInt();
		System.out.println("Enter width of rectangle:-");
		int wid=scanner.nextInt();
		setLength(len);
		setWidth(wid);
	double	 area= getLength()*getWidth();
		System.out.println("Area of rectangle "+area);
		
	}

}
