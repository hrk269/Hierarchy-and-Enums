package edu.nyu.cs9053.homework4.hierarchy;

public class FigureSkater extends IceSkater {
	
	private final String favoriteMove;

	public FigureSkater(String name, int age, int skateSize, String favoriteMove) {
		super(name, age, skateSize);
		this.favoriteMove = favoriteMove;
	}

	@Override public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if ( (obj == null) || (getClass() != obj.getClass()) ) {
			return false;
		}
		FigureSkater player = (FigureSkater) obj;
		if (getName() != player.getName()) {
			return false;
		}
		if (getAge() != player.getAge()) {
			return false;
		}
		if (getSkateSize() != player.getSkateSize()) {
			return false;
		}
		if (this.favoriteMove != player.favoriteMove) {
			return false;
		}
		return true;
	}

	@Override public int hashCode() {
		int result = 31 * getAge() + (getName() == null ? 0 : getName().hashCode());
		result = 31 * result + getSkateSize();
		result = 31 * result + (this.favoriteMove == null ? 0 : this.favoriteMove.hashCode());
		return result;
	}

}