package thread;
//without using synchronization
 class MyThread {
	void print(int num) {//without sync
		for(int i=1;i<=5;i++) {
			System.out.println(num*i);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}}
	class Thread1 extends Thread{
		MyThread ws;
		Thread1(MyThread ws){
			this.ws=ws;
		}
		public void run() {
			ws.print(5);//5*1 5*2....
		}
	}
	class Thread2 extends Thread{
		MyThread ws;
		Thread2(MyThread ws){
			this.ws=ws;
		}
		public void run() {
			ws.print(50);//500*1 500*2....
		}
	}
	class WithoutSynchronization{
		public static void main(String[] args) {
			MyThread obj=new MyThread();
			Thread1 t1=new Thread1(obj);
			Thread2 t2=new Thread2(obj);
			t1.start();
			t2.start();
		}
	}


