
import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable {
	
	private final CountDownLatch countDown;
	private final CountDownLatch await;
	
	public MyRunnable(CountDownLatch countDown, CountDownLatch await){
		this.countDown = countDown;
		this.await = await;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			countDown.await();
			System.out.println("Waitting thread start......");
			await.countDown();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
