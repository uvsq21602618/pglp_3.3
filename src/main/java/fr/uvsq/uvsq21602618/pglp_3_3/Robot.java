package fr.uvsq.uvsq21602618.pglp_3_3;

public class Robot {
	private Position position;
	private Direction direction;
	
	public Robot(Position pos, Direction dir) {
		this.position=pos;
		this.direction=dir;
	}
	
	public void tourne() {
		if(direction.equals(Direction.NORD)) {
			this.direction=Direction.EST;
		}
		else if(direction.equals(Direction.EST)) {
			this.direction=Direction.SUD;
		}
		else if(direction.equals(Direction.SUD)) {
			this.direction=Direction.OUEST;
		}
		else {
			this.direction=Direction.NORD;
		}
		
	}
	
	public void avance() {
		
	}

}
