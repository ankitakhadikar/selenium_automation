package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import testScript.Rediff_login_01;

public class screenshots extends Rediff_login_01 
{
	public static  void  screenshot() throws IOException
	{
		
     
		File  src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C:\\Users\\Ankita\\Documents\\JAVA classes\\Maven_testNG\\src\\main\\resources\\ScreenShorts\\screen.png"));
		System.out.println("Screenshot taken successfully"); 
		
	}
}
