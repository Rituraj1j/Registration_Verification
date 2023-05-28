package Register_Verification;

public enum GenderType {
	MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private final String value;

    GenderType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
