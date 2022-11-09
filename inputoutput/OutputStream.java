package IO;

import java.io.FileOutputStream;

public class OutputStream {
public static void main(String[] args) {
	try {
		//write byte
		FileOutputStream f=new FileOutputStream("D:\\tiyasa.txt");  //destination
	f.write(67);
	 f.close();
	 System.out.println("done");
	 /*
		//write string
		String s="tiyasa naskar";
		byte b[]=s.getBytes();  //converting strin g into byte array
		f.write(b);
		f.close();
		System.out.println("done");*/
		
	}catch(Exception e) {
		System.out.println(e);
	}
}
}
