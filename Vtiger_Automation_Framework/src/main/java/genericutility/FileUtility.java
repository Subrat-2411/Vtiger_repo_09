package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String getDatafromProperty(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commondata.properties");
		
		Properties pro=new Properties();
		
		pro.load(fis);
		
		return pro.getProperty(key);
	}
}
