package Register_Verification;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadFromFile {
	public static void readData(String readme)
	{
		BufferedReader read = null;
		String line ="";
		int row = 1;
		try {
			read = new BufferedReader(new FileReader(readme));
			read.readLine();
			while((line = read.readLine())!= null)	
			{
					String[] l1 = line.split(",");
					String email = l1[0];
					String age = l1[1];
					String name = l1[2];
					String password = l1[3];
					String gender =  l1[5];
					String lang = l1[5];
					String mob_no = l1[6];
					Register_Input ri = new Register_Input(email, age, name, password, gender, lang, mob_no , row);
					ri.Allverify();
				row++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(read!=null) {
					read.close();
				}
			}
			catch(IOException io)
			{
				io.printStackTrace();
			}
		}
	}
}
