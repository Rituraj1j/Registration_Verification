package Register_Verification;

public class emailVerification extends EmailVerify{

	@Override
	public void verifyEmail(String email, int row) 
	{
		
		if(email.isEmpty()||email.isBlank())
		{
			String result1 = "Entered email is empty or blank in row no "+ row;
			ResultPublisher.publisher(result1);
		}
		else {
			if(email.length()>=6&&email.length()<=50)
			{
				if(email.contains("@")&&email.contains("."))
				{
					if(email.matches("[a-z0-9]+[@][a-z]+[//.][a-z]+{2,3}"))
					{
						System.out.println("email verified at row no "+row);
					}
				
					else
					{
						String result1 = "Entered valid email row no "+ row;
						ResultPublisher.publisher(result1);
					}
				}
				else
				{
					String result1 = "Entered email does not contain @ or . at row no "+ row;
					ResultPublisher.publisher(result1);
				}
			}
			else
			{
				String result1 = "Entered name is not in the range of 6 to 50 at row no "+ row;
				ResultPublisher.publisher(result1);
			}
		}
	}

}
