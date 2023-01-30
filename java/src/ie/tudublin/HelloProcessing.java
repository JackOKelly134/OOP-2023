package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		//colorMode(HSB);
		background(255,0,0);

		
	}

	float x1, y1, x2, y2;
	float x1dir, x2dir, y1dir, y2dir;
	float c = 0;
	
	public void draw()
	{	
		//stroke(255);
		noStroke();
		fill(250,250,0);
		//line(10,10,100,100);
		circle(250,250,400);
		fill(0,255,255);
		triangle(250,0,40,400,450,400);
		fill(250);
		ellipse(250,200,200,100);
		fill(0,0,0);
		circle(250,200,90);
		fill(0,0,0);
		circle(mouseX,mouseY, 10);
		//rect(10,300,20,100);
		//stroke(127);
		//triangle(40,90,300,20,80,70);

	}
}
