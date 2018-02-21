package edu.nyu.cs9053.homework4.hierarchy;

public class CrossCountrySkier extends Skier {
	
	private final String skiColor;

	public CrossCountrySkier(String name, int age, int skiLength, String skiColor) {
		super(name, age, skiLength);
		this.skiColor = skiColor;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		CrossCountrySkier player = (CrossCountrySkier) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSkiLength() != player.getSkiLength()) {
			return false;
		}
		if (this.skiColor != player.skiColor) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + getSkiLength();
		result = 31 * result + (this.skiColor == null ? 0 : this.skiColor.hashCode());
		return result;
	}

}