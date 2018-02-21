package edu.nyu.cs9053.homework4.hierarchy;

public class SpeedSkater extends IceSkater {
	
	private final int maximumSpeed;

	public SpeedSkater(String name, int age, int skateSize, int maximumSpeed) {
		super(name, age, skateSize);
		this.maximumSpeed = maximumSpeed;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		SpeedSkater player = (SpeedSkater) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSkateSize() != player.getSkateSize()) {
			return false;
		}
		if (this.maximumSpeed != player.maximumSpeed) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + getSkateSize();
		result = 31 * result + this.maximumSpeed;
		return result;
	}

}