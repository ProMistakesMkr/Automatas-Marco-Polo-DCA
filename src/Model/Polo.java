package Model;

import processing.core.PApplet;

public class Polo implements Runnable {

	private float posX, posY, rebote;
	private int size = 20;
	private PApplet app;

	public Polo(float posX, float posY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.app = app;
		this.rebote = 1;
	}

	public void draw() {
		app.fill(49, 49, 205);
		app.circle(posX, posY, size);

	}

	public void mov() {

		posX += 2 * 2 * rebote;
		posY += 2 * 2 * rebote;

		if (posX < 0 || posX > app.width) { 
			rebote *= -1;
		}
		if (posY < 0 || posY > app.height) {
			rebote *= -1;
		}

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

	public float getRebote() {
		return rebote;
	}

	public void setRebote(float rebote) {
		this.rebote = rebote;
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
	
	

	@Override
	public void run() {

		try {
			Thread.sleep(2000);
			mov();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void remove(Polo current) {
		// TODO Auto-generated method stub
		
	}

}
