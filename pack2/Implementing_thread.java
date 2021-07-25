package pack2;


public class Implementing_thread implements Runnable{
	
	Thread t;
	
	public Implementing_thread(){
		t=new Thread(this,"Child Thread");
		System.out.println("Thread: "+t);
		t.start();
	}
	
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(int i=3;i>0;i--) {
				System.out.println("Sub process or child thread exiting in: "+i+" seconds.");
				Thread.sleep(500);
			}
		}
		catch(Exception e) {
			System.out.println("Sub process exit interrupted.");
		}
		System.out.println("Exiting Sub process or child thread.");	
	}
		
}
	