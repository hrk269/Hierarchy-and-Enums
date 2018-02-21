package edu.nyu.cs9053.homework4.hierarchy;

public class SkeletonPlayer extends Sledder {

	private final int sledWidth;
	
	public SkeletonPlayer(String name, int age, String sledColor, int sledWidth) {
		super(name, age, sledColor);
		this.sledWidth = sledWidth;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		SkeletonPlayer player = (SkeletonPlayer) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSledColor() != player.getSledColor()) {
			return false;
		}
		if (this.sledWidth != player.sledWidth) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + (getSledColor() == null ? 0 : getSledColor().hashCode());
		result = 31 * result + this.sledWidth;
		return result;
	}

}