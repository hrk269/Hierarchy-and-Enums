package edu.nyu.cs9053.homework4.hierarchy;

public class Bobsledder extends Sledder {
	
	private final int teamSize;

	public Bobsledder(String name, int age, String sledColor, int teamSize) {
		super(name, age, sledColor);
		this.teamSize = teamSize;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		Bobsledder player = (Bobsledder) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSledColor() != player.getSledColor()) {
			return false;
		}
		if (this.teamSize != player.teamSize) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + (getSledColor() == null ? 0 : getSledColor().hashCode());
		result = 31 * result + this.teamSize;
		return result;
	}

}