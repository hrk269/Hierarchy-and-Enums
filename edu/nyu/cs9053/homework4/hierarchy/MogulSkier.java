package edu.nyu.cs9053.homework4.hierarchy;

public class MogulSkier extends Skier {
	
	private final String helmetColor;

	public MogulSkier(String name, int age, int skiLength, String helmetColor) {
		super(name, age, skiLength);
		this.helmetColor = helmetColor;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		MogulSkier player = (MogulSkier) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSkiLength() != player.getSkiLength()) {
			return false;
		}
		if (this.helmetColor != player.helmetColor) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + getSkiLength();
		result = 31 * result + (this.helmetColor == null ? 0 : this.helmetColor.hashCode());
		return result;
	}

}