package edu.nyu.cs9053.homework4;

public enum OlympicGame {
	
	I("France"),

	II("Switzerland"),

	III("United States"),

	IV("Germany"),

	V("Switzerland"),

	VI("Norway"),

	VII("Italy"),

	VIII("United States"),

	IX("Austria"),

	X("France"),

	XI("Japan"),

	XII("Austria"),

	XIII("United States"),

	XIV("Yugoslavia"),

	XV("Canada"),

	XVI("France"),

	XVII("Norway"),

	XVIII("Japan"),

	XIX("United States"),

	XX("Italy"),

	XXI("Canada"),

	XXII("Russia"),

	XXIII("South Korea");

	private String hostCountry;

	OlympicGame(String hostCountry) {
		this.hostCountry = hostCountry;
	}

	public String getHostCountry() {
		return hostCountry;
	}

	 public static void printHostCountries(OlympicGame ... arguments){
	 	StringBuilder countries = new StringBuilder();
	 	for (OlympicGame argument : arguments) {
	 		countries.append(argument.getHostCountry() + "\n");
	 	}
	 	countries.toString();
	 	System.out.println(countries);
	 }

}