package array;

public class MultidimentionalArray {
	public static void main(String[] args) {
	//int a[][]=new int[2][3];
	//int [][]b=new int[2][3];
   int b[][]= {{1,2},{3,4},{5,6}};
   for(int i=0;i<3;i++) {
	   for(int j=0;j<2;j++) {
		   System.out.print(b[i][j]);
	   }
	   System.out.println();
   }
}}
