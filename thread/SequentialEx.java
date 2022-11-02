package thread;
//execute one after another
public class SequentialEx {
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(1000);//thread sleep working for a specific amount of time
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		SequentialEx s1=new SequentialEx();
		SequentialEx s2=new SequentialEx();
		SequentialEx s3=new SequentialEx();
		s1.run();
		s2.run();
		s3.run();
	}

}
