package edu.nyu.cs9053.homework4;

public enum OlympicMedal {
	
	Gold(1),

	Silver(2),

	Bronze(3);

	private final Integer placement;

	OlympicMedal(Integer placement) {
		this.placement = placement;
	}

	public Integer getPlacement() {
		return placement;
	}

}