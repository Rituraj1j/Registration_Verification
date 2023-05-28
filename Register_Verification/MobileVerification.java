package Register_Verification;

public class MobileVerification implements MobileVerify {

	@Override
	public void verifyMobile(String mob_no, int row) {
		if(mob_no.isEmpty()||mob_no.isBlank())
		{
			String result = "Enter a valid mobile number in row no "+ row;
			ResultPublisher.publisher(result);
		}
		else {
			if(mob_no.length()==13)
			{
				if(mob_no.matches("\\+[1-9]\\d{1,2}[789]\\d{9}"))
				{
					System.out.println("Mobile number is verified at row no "+row);
				}
			}
			else
			{
				String result = "Entered mobile number is not valid at row no "+ row ;
				ResultPublisher.publisher(result);
			}
		}
	}

}
