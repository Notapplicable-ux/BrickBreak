//Name: Anand Raj
//Description of class
// Making a ball hat move in the brick breaker app

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
	public Ball (int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		this.changeX = 3;
		this.changeY = -1;
	}
	
	
	//constructor(s):

	//methods:
	public void move(){
		x += changeX;
		y += changeY;
	}
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
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
	public void reverseX() {
		changeX *= -1;
	}
	public void reverseY() {
		changeY *= -1;
	}
}
