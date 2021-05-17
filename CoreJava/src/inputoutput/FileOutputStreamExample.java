package inputoutput;
import java.io.*;
public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		FileOutputStream fout = new FileOutputStream("E:\\sindhu.txt");
		
		String s= "import org.openqa.selenium.WebDriver;\r\n" + 
				"import org.openqa.selenium.chrome.ChromeDriver;\r\n" + 
				"import org.openqa.selenium.firefox.FirefoxDriver;\r\n" + 
				"public class FirstProgram {\r\n" + 
				"\r\n" + 
				"	public static void main(String[] args) {\r\n" + 
				"		//ChromeDriver driver = new ChromeDriver();\r\n" + 
				"          WebDriver driver = new FirefoxDriver();\r\n" + 
				"          driver.get(\"https://www.google.com\");\r\n" + 
				"          driver.close();\r\n" + 
				"	}\r\n" + 
				"\r\n" + 
				"}";
		
		byte []b=s.getBytes();
		
		fout.write(b);
		
		fout.close();

	}

}
