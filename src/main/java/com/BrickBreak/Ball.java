//Name: Anand Raj
//Description of class

package com.BrickBreak;
import java.awt.*;
import java.awt.Color;

public class Ball {
	//your code here!
	private int x;
	private int y;
	private double changeX;
	private double changeY;
	private int size;
	private Color color;
	//don't forget you need instance variables:
	public Ball (int x, int y, int changeX, int changeY, Color color, int size){
		this.x = x;
		this.y = y;
		this.changeX = changeX;
		this.changeY = changeY;
		this.color = color;
		this.size = size;
	}
	
	
	//constructor(s):

	//methods:
	public void moveBall(){
		x += changeX;
		y += changeY;
	}
	public void setX(){
		this.x = x;
	}
	public void setY(){
		this.y = y;
	}
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		g.fillOval(x, y, size, size);
	}
	public int getXpos(){
		return x;
	}
	public int getYpos(){
		return y;
	}
	public int getSize(){
		return size;
	}
	public double getChangeX(){
		return changeX;
	}
	public double getChangeY(){
		return changeY;
	}
	public void setXVelocity(int changeX) {
		this.changeX = changeX;
	}
	public void setYVelocity(int changeY) {
		this.changeY = changeY;
	}
}
