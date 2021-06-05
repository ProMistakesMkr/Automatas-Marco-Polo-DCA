package Model;

import processing.core.PApplet;

public class Marco implements Runnable {

	private float posX, posY;
	private int size = 30;
	private PApplet app;

	public Marco(float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
	}

	public void draw() {
		app.fill(227,188,28);
		app.circle(posX, posY, size);
	}

	public void mov() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
