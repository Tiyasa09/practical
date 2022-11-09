package IO;

import java.io.FileOutputStream;

public class BufferedOutputStream {
public BufferedOutputStream(FileOutputStream f) {
		
	}

public static void main(String[] args) {
	try {
		FileOutputStream f=new FileOutputStream("D:\\tiyasa.txt");
	BufferedOutputStream bos=new BufferedOutputStream(f);
		
	String s="i am tiyasa";
	byte b[]=s.getBytes();
	f.write(b);
	f.close();
	System.out.println("done");
	}catch(Exception e) {
	System.out.println(e);
}
}}
