package thread;
//using thread class
/*public class ThreadState extends Thread{
	public void run() {
		System.out.println("thread activated");
	}
	public static void main(String[] args) {
		ThreadState ob=new ThreadState();
		ob.start();
	}

}*/

//using runnable class
public class ThreadState implements Runnable{
	public void run() {
		System.out.println("thread activated");
	}
	public static void main(String[] args) {
		ThreadState ob=new ThreadState();
		Thread t=new Thread(ob);
		t.start();
	}}