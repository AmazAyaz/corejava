package core;

class SynchronizedBlockLock {

public void loop() {
	
	for (int i=1; i<=3 ; i++) {
		
		System.out.println("select....."+ i);
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
synchronized(SynchronizedBlockLock.class) { 

       for (int i=1; i<=3 ; i++) {
		
		System.out.println("insert....."+ i);
	
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}


}

}


public class SynchronizedEx {
	
	public static void main(String[] args) {
		
		SynchronizedBlockLock sb = new SynchronizedBlockLock();
		SynchronizedBlockLock sb2 = new SynchronizedBlockLock();
		ThreadEx t1 = new ThreadEx(sb);
		ThreadEx t2 = new ThreadEx(sb);
		t1.start();
		t2.start();
	}
	
}

class ThreadEx extends Thread {
	
	SynchronizedBlockLock obj;
	
	public ThreadEx(SynchronizedBlockLock obj) {
		this.obj = obj;
		
	}
	
	public void run(){
	
		obj.loop();
		
	}
}
