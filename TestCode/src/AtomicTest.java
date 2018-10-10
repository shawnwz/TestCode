import java.util.concurrent.atomic.AtomicInteger;

public class AtomicTest implements Runnable {
	
	private final AtomicInteger count = new AtomicInteger(0);

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + ":" + count.incrementAndGet());
	}
	
	public static void main(String[] args){
		AtomicTest atomicTest = new AtomicTest();
		Thread t1 = new Thread(atomicTest);
		Thread t2 = new Thread(atomicTest);
		Thread t3 = new Thread(atomicTest);
		Thread t4 = new Thread(atomicTest);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}
	
}
