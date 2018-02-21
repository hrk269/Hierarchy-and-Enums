package edu.nyu.cs9053.homework4.hierarchy;

public class Snowboarder extends WinterSportPlayer {
	
	private final int boardLength;

	public Snowboarder(String name, int age, int boardLength) {
		super(name, age);
		this.boardLength = boardLength;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		Snowboarder player = (Snowboarder) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (this.boardLength != player.boardLength) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + this.boardLength;
		return result;
	}

}