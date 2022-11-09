package IO;

import java.io.FileInputStream;
public class BufferedInputStream{
	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("D:\\tiyasa.txt");
			//int i=f.read();
			//System.out.println((char)i);
			int i=0;
			  while((i=f.read())!=-1){
			  System.out.print((char)i);
			  }
			/*for(int i=f.read();i>=0;i=f.read()) {
				System.out.print((char)i);
			}*/
			f.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
