
import java.util.concurrent.CountDownLatch;



public class LatchTest {
	
	public static void main(String[] args) throws InterruptedException{
		CountDownLatch countDown = new CountDownLatch(2);
		CountDownLatch await = new CountDownLatch(5);
		
		for (int i=0; i<5; ++i){
			new Thread(new MyRunnable(countDown, await)).start();
		}
		
		System.out.println("AAAAAAAAAAAAAAAA");
		System.out.println("BBBBBBBBBBBBBBBBB");
		countDown.countDown();
		countDown.countDown();
		await.await();
		System.out.println("XXX");
	}
}