package fr.uvsq.uvsq21602618.pglp_3_3;

import java.util.ArrayList;

public class Robots {
	private ArrayList<RobotStatique> listeRobots;
	
	public Robots() {
		listeRobots = new ArrayList<RobotStatique>();
	}
	
	public void addRobot(RobotStatique R) {
		this.listeRobots.add(R);
	}
	
	public void avancerTous() throws unsupportedOperationException {
		if(!listeRobots.isEmpty()) {
			for(RobotStatique R: listeRobots) {
				R.avance();
			}
		}
	}
}
