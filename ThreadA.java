package Session8;

public class ThreadA extends Thread{
	@Override
	public void run() {
	
		for (int i=0;i<100;i++){
			System.out.println("Thread A class "+Thread.currentThread().getName()+" "+ i+" "+Thread.currentThread().getPriority());
		}
	}
}
