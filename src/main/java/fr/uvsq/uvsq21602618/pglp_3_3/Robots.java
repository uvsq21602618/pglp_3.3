package fr.uvsq.uvsq21602618.pglp_3_3;

import java.util.ArrayList;

public class Robots {
	private ArrayList<Robot> listeRobots;
	
	public Robots() {
		listeRobots = new ArrayList<Robot>();
	}
	
	public void addRobot(Robot R) {
		this.listeRobots.add(R);
	}
}
