package Register_Verification;

import java.io.IOException;

public class PasswordVerification implements PasswordVerify {

	@Override
	public void verifyPassword(String password, int row) {
		if(password.isEmpty()||password.isBlank())
		{
			String result = "Enter a valid password in row no "+ row ;
			ResultPublisher.publisher(result);
		}
		else {
			if(password.length()>=8&&password.length()<=50)
			{
				char[] pass = password.toCharArray();
				boolean hasCharacter = false ;
				boolean hasNumber = false ;
				boolean hasSpecialChar = false ;
				 for (char ch : pass) {
			            if (Character.isLetter(ch)) {
			                hasCharacter = true;
			            } else if (Character.isDigit(ch)) {
			                hasNumber = true;
			            } else if (ch == '@' || ch == '#') {
			                hasSpecialChar = true;
			            }
			        }
				 if(hasCharacter==true&&hasNumber==true&&hasSpecialChar==true)
				 {
					 System.out.println("Entered password is verified at row no "+row);
				 }
				 else
				 {
					 String result = "Enter a valid password which cointain a combines of uppercase , lowercase and special character in row no "+ row ;
						ResultPublisher.publisher(result);
				 }
			}
			else
			{
				String result = "Entered password is not in the range of 8 to 50 at row no "+ row ;
				ResultPublisher.publisher(result);
			}
		}
	}

}
