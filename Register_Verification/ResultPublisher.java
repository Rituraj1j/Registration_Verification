package Register_Verification;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResultPublisher {
 public static void publisher(String result)
 {
	 BufferedWriter write = null;
	 try {
		 write = new BufferedWriter(new FileWriter("outputfile.txt"));
		write.write(result);
	} catch (IOException e) {
		e.printStackTrace();
	}
	 finally {
		try {
			write.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
 }
}
