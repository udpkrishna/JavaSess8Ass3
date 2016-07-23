package Session8;

public class ThreadB extends Thread{
	@Override
	public void run() {
	
		for (int i=0;i<100;i++){
			System.out.println("Thread B class "+Thread.currentThread().getName()+" "+ i+" "+Thread.currentThread().getPriority());
		}
	}
}
