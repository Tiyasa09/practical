package IO;


import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArray_op {
	public static void main(String[] args) {
		try {
			FileOutputStream f1=new FileOutputStream("D:\\tiyasa.txt");
			FileOutputStream f2=new FileOutputStream("D:\\text.txt");
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write(65);
		bos.writeTo(f1);
		bos.writeTo(f2);
		bos.close();
		System.out.println("done");
		}catch(Exception e) {
		System.out.println(e);
	}
	}}
