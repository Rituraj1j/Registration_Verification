package Register_Verification;

public class LanguageVerification implements LanguageVerify {

	@Override
	public void verifyLangage(String lang, int row) {
		if(lang.isEmpty()||lang.isBlank())
		{
			String result = "Entered language is not valid at row no "+ row;
			ResultPublisher.publisher(result);
		}
		else
		{
			for(LanguageType lt : LanguageType.values())
			{
				if(lt.getValue().equalsIgnoreCase(lang))
				{
				System.out.println("entered language is verified at row no "+row);
				}
				else
				{
					String result = "Entered language is not valid at row no "+ row;
					ResultPublisher.publisher(result);
				}
			}
		}
	}

}
