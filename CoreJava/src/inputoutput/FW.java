package inputoutput;
import java.io.*;
public class FW {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("E:\\sindhu.doc");
        fw.write("import java.io.*;\r\n" + 
        		"public class FW {\r\n" + 
        		"\r\n" + 
        		"	public static void main(String[] args) throws IOException {\r\n" + 
        		"		FileWriter fw = new FileWriter(\"E:\\\\sindhu.doc\");\r\n" + 
        		"        fw.write(\"Hello,this is Sindhu from Hyderabad!\");\r\n" + 
        		"        fw.close();\r\n" + 
        		"	}\r\n" + 
        		"\r\n" + 
        		"}");
        fw.close();
	}

}
