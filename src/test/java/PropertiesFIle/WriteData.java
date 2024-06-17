package PropertiesFIle;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		
		properties.setProperty("Name","ravindra Singh");
		properties.setProperty("age", "31");
		properties.setProperty("Department", "Software Testing");
		properties.setProperty("Email", "rav48.singh@gmail.com");
		
		String filePath = System.getProperty("user.dir")+"\\Data\\basic.properties";

		FileOutputStream file = new FileOutputStream(filePath);
		properties.store(file, "sample data");
		file.close();
	}

}
