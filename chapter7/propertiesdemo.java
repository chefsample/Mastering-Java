import java.util.Date;
import java.util.Properties;

public class propertiesdemo {
	public static void main(String[] args) {
		Properties p = new Properties();
		
		p.setProperty("firstName", "Sudheer Akula");
		p.setProperty("website","hadoopbuzz.wordpress.com");
		
		String str = p.getProperty("website");
		
		System.out.println(str);
		
		Date d = new Date();
		
		System.out.println(d);
	}

}
