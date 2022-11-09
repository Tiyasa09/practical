package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InputStream {
public static void main(String[] args) {
	try {
		FileInputStream f=new FileInputStream("D:\\tiyasa.txt");
	BufferedInputStream bos=new BufferedInputStream(f);
	int i;
	while(( i=bos.read())!=-1);{
	System.out.print((char)i);}
	
	
	f.close();bos.close();
	System.out.println("done");
	}
catch(Exception e) {
	System.out.println(e);
}}}
