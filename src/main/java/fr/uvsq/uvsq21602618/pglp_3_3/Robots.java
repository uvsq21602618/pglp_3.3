package fr.uvsq.uvsq21602618.pglp_3_3;

import java.util.ArrayList;

import fr.uvsq.uvsq21602618.Pglp_3_2.Employe;

public class Robots {
	private ArrayList<Robot> listeRobots;
	
	public Robots() {
		listeRobots = new ArrayList<Robot>();
	}
	
	public void addRobot(Robot R) {
		this.listeRobots.add(R);
	}
	
	public void avancerTous() throws unsupportedOperationException {
		if(!listeRobots.isEmpty()) {
			for(Robot R: listeRobots) {
				R.avance();
			}
		}
	}
}
