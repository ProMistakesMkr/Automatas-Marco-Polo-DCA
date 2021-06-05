package Model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Mundo {

	private ArrayList<Polo> polos;
	Marco marco;

	public Mundo(PApplet app) {
		polos = new ArrayList<Polo>();
		marco = new Marco(350, 350, app);

		for (int i = 0; i < 20; i++) {
			float posX = app.random(7, 690);
			float posY = app.random(7, 690);

			polos.add(new Polo(posX, posY, app));
		}
	}

	public void draw() {
		marco.draw();

		for (Polo polos : polos) {
			polos.draw();
			new Thread(polos).start();

			if (Polo.get(i).getDist() < 30) {
				Polo current = polos.get(i);
				Polo.remove(current);
			}
		}
	}
}
