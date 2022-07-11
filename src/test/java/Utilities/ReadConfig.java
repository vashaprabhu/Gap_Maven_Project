package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class ReadConfig {
	Properties prop;
	
	public ReadConfig()
	{
		File src = new File(AppConstants.APP_DETAILS);
		
		try {
			FileInputStream fis = new FileInputStream(src);
			prop = new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String getApplicationURL() {
		String url = prop.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String userName = prop.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		String passWord = prop.getProperty("password");
		return passWord;
	}

}
