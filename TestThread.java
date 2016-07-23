package Session8;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<100;i++){
			System.out.println("Main thread "+Thread.currentThread().getName()+" "+i);
		}
		
		ThreadA ta=new ThreadA();
		ta.setPriority(Thread.MIN_PRIORITY);
		ta.start();
		
		ThreadB tb=new ThreadB();
		tb.setPriority(Thread.NORM_PRIORITY);
		tb.start();
		
		ThreadC tc=new ThreadC();
		tc.setPriority(Thread.MAX_PRIORITY);
		tc.start();
	}

}
