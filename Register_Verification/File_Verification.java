package Register_Verification;

public class File_Verification {
	public void File_Verify()
	{
		String readme = "C:\\Users\\SNP\\Desktop\\io\\input.csv";
        
        if(readme.endsWith(".csv"))
        {
        	ReadFromFile.readData(readme);
        	System.out.println("file is in csv format");
        }
        else 
        {
        	String result = "File is not in csv format";
			ResultPublisher.publisher(result);
        }
        System.out.println("inside file verify");
	}
}
