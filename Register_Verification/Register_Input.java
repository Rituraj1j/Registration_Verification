package Register_Verification;

public class Register_Input
{
	private final String email ;
	private final String age ;
	private final String name ;
	private final String password ;
	private final String gender ;
	private final String lang ;
	private final String mob_no ;
	private final int row ;
	public Register_Input(String email, String age, String name, String password, String gender, String lang,String mob_no, int row1) {
		this.email = email;
		this.age = age;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.lang = lang;
		this.mob_no = mob_no;
		this.row=row1;
	}
	
	public String getEmail() {
		return email;
	}

	public String getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getGender() {
		return gender;
	}

	public String getLang() {
		return lang;
	}

	public String getMob_no() {
		return mob_no;
	}

	public int getRow() {
		return row;
	}

	public void eVerify() {
		EmailVerify ev = new emailVerification();
		ev.verifyEmail(getEmail(),getRow());
	}
	public void aVerify() {
		AgeVerify ev = new AgeVerification();
		ev.verifyAge(getAge(),getRow());
	}
	public void nVerify() {
		NameVerify ev = new NameVerification();
		ev.verifyName(getName(),getRow());
	}
	public void pVerify() {
		PasswordVerify ev = new PasswordVerification();
		ev.verifyPassword(getPassword(),getRow());
	}
	public void gVerify() {
		GenderVerify ev = new GenderVerification();
		ev.verifyGender(getGender(),getRow());
	}
	public void lVerify() {
		LanguageVerify ev = new LanguageVerification();
		ev.verifyLangage(getLang(),getRow());
	}
	public void mVerify() {
		MobileVerify ev = new MobileVerification();
		ev.verifyMobile(getMob_no(),getRow());
	}
	public void Allverify()
	{
		eVerify();
		aVerify();
		nVerify();
		pVerify();
		gVerify();
		lVerify();
		mVerify();
	}
}
