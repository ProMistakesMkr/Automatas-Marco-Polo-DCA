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
		app.fill(227, 188, 28);
		app.circle(posX, posY, size);
	}

	public void mov(float poloX, float poloY) {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public float getPosX() {
		return posX;
	}

	public void setPosX(float posX) {
		this.posX = posX;
	}

	public float getPosY() {
		return posY;
	}

	public void setPosY(float posY) {
		this.posY = posY;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
	
}
