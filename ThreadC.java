package Session8;

public class ThreadC extends Thread{
	@Override
	public void run() {
	
		for (int i=0;i<100;i++){
			System.out.println("Thread C class "+Thread.currentThread().getName()+" "+ i+" "+Thread.currentThread().getPriority());
		}
	}

}
