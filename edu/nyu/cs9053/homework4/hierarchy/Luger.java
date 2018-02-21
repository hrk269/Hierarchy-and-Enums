package edu.nyu.cs9053.homework4.hierarchy;

public class Luger extends Sledder{
	
	private final int recordSpeed;

	public Luger(String name, int age, String sledColor, int recordSpeed) {
		super(name, age, sledColor);
		this.recordSpeed = recordSpeed;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		Luger player = (Luger) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSledColor() != player.getSledColor()) {
			return false;
		}
		if (this.recordSpeed != player.recordSpeed) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + (getSledColor() == null ? 0 : getSledColor().hashCode());
		result = 31 * result + this.recordSpeed;
		return result;
	}

}