package Register_Verification;

import java.io.IOException;

public class AgeVerification implements AgeVerify {

	@Override
	public void verifyAge(String age, int row) {
		int age1 = Integer.parseInt(age);
		if(age1>18&age1<=150)
		{
			System.out.println("Age is verified ");
		}
		else
		{
			String result = "Entered age not between 0 to 150 at row no "+ row;
			ResultPublisher.publisher(result);
		}
	}

}
