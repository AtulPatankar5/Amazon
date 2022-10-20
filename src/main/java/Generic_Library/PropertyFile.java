package Generic_Library;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String getPropertyFile2(String key) throws IOException
	{
	Properties p= new Properties();
	FileInputStream fis= new FileInputStream(Autoconstant.Propertypath);
	p.load(fis);
	
	return p.getProperty(key);
	}
}
