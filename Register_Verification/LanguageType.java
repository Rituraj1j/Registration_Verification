package Register_Verification;

public enum LanguageType {
	ENGLISH("English"),
	HINDI("Hindi"),
	MARATHI("Marathi"),
	FRENCH("French"),
	GERMAN("german");
	
	private final String value ;
	LanguageType(String lang) {
		this.value = lang;
	}
	public String getValue() {
		return value;
	}
	
}
