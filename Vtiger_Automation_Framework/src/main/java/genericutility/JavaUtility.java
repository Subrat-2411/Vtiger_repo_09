package genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {

	/**
	 * This method is used to get System time in String format.
	 * @return 
	 */
	public String getSystemTime()
	{
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This Method is used to get random number.
	 * @return
	 */
	public int getRandomNumber()
	{
		Random ran=new Random();
		
		return ran.nextInt(1000);
	}

}
