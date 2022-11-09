package IO;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArray_ip {
	public static void main(String[] args)  {  
	    byte[] b = { 66,68,67,90 };  
	    // Create the new byte array input stream  
	  ByteArrayInputStream bi = new ByteArrayInputStream(b);  
	    int i ;  
	    while ((i = bi.read()) != -1) {  
	      //Conversion of a byte into character  
	      char ch = ((char)i);  
System.out.println("ASCII  Character is:" + i +" ,"+"value is: "+ch);  
	    }  
	  }  
	}
