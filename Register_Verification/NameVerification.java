package Register_Verification;

import java.io.IOException;

public class NameVerification implements NameVerify {

	@Override
	public void verifyName(String name, int row) {
		String name1 = name.trim();
		if(name1.isEmpty()||name1.isBlank())
		{
			String result = "Enter a valid name in row no "+ row;
			ResultPublisher.publisher(result);
		}
		else {
			if(name1.length()>0&&name1.length()<=50)
			{
				if(name1.matches("[a-zA-Z ]+"))
				{
					System.out.println("name verified at row no "+ row);
				}
				else
				{
					String result = "Entered name contains number or special char at row no "+ row;
					ResultPublisher.publisher(result);
				}
			}
			else
			{
				String result = "Entered name is not in the range of 1 to 50 at row no "+ row;
				ResultPublisher.publisher(result);
			}
		}
	}
	
}
