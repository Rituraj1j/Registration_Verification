package Register_Verification;

public class GenderVerification implements GenderVerify {

	@Override
	public void verifyGender(String gender, int row) {
		if(gender.isEmpty()||gender.isBlank())
		{
			String result = "Enter a valid gender in row no "+ row ;
			ResultPublisher.publisher(result);
		}
		else {
			for(GenderType gt1 : GenderType.values())
			{
				if(gt1.getValue().equalsIgnoreCase(gender))
				{
					System.out.println("Gender verified at row no " +row);
				}
				else
				{
					String result ="Entered gender is not valid at row no "+ row ;
					ResultPublisher.publisher(result);
				}
			}
		}
		
	}

}
