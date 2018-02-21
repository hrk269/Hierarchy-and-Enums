package edu.nyu.cs9053.homework4.hierarchy;

public class Curler extends WinterSportPlayer{
	
	private final int bestScore;

	public Curler(String name, int age, int bestScore){
		super(name, age);
		this.bestScore = bestScore;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		Curler player = (Curler) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (this.bestScore != player.bestScore) {
			return false;
		}
		return true;
	}

	@Override public int hashCode(){
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + this.bestScore;
		return result;
	}

}