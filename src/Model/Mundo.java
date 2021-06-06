package Model;

import java.util.ArrayList;

import Model.Polo;
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

			/*
			 * if (Polo.get(i).getDist() < 30) {//Idea de como desaparecer a los polos Polo
			 * current = polos.get(i); Polo.remove(current); }
			 */

		}
	}

	public void movMarco() {
		int distMP = 700;
		int DistMaP = 0;
		int position = 0;

		if (polos.size() == 0) {
		}

		for (int i = 0; i < polos.size(); i++) {
			DistMaP = (int) PApplet.dist(marco.getPosX(), marco.getPosY(), polos.get(i).getPosX(),
					polos.get(i).getPosY());
			if (DistMaP < distMP) {
				distMP = DistMaP;
				position = i;
			}
		}
		if (PApplet.dist(marco.getPosX(), marco.getPosY(), polos.get(position).getPosX(),
				polos.get(position).getPosY()) < 20) {
			polos.remove(position);
		}

		if (polos.get(position).getPosX() == marco.getPosX() && polos.get(position).getPosY() < marco.getPosY()) {

		} else if (polos.get(position).getPosX() > marco.getPosX()
				&& polos.get(position).getPosY() < marco.getPosY()) {

		} else if (polos.get(position).getPosX() > marco.getPosX()
				&& polos.get(position).getPosY() == marco.getPosY()) {

		} else if (polos.get(position).getPosX() > marco.getPosX()
				&& polos.get(position).getPosY() > marco.getPosY()) { //No se por que verga no funciona, auxilio

		} 	

	}
}
