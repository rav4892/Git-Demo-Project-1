package PropertiesFIle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.Properties;
import java.util.Set;

public class ReadData {
public static void main(String args[]) throws IOException {
	
	Properties properties = new Properties();
	
//	String filePath = System.getProperty("user.dir")+"\\Data\\basics.properties";
	String filePath = System.getProperty("user.dir")+"\\Data\\basic.properties";
	
	FileInputStream file = new FileInputStream(filePath);
	properties.load(file);
	file.close();
	
	String name = properties.getProperty("Name");
	System.out.println(name);
	String age = properties.getProperty("age");
	System.out.println(age);
	String dept = properties.getProperty("Department");
	System.out.println(dept);
	String mail = properties.getProperty("Email");
	System.out.println(mail);
	
	Set<String> keys = properties.stringPropertyNames();
	System.out.println("All keys = "+keys);
	System.out.println();
	
	Set<Object> allKeys = properties.keySet();
	System.out.println("all keys = "+allKeys);
	
	Collection<Object> values = properties.values();
	System.out.println("all values = "+ values);
	
	for(String key:properties.stringPropertyNames())
	{
		
		System.out.println(key+" = "+properties.getProperty(key));
	}
}
}
