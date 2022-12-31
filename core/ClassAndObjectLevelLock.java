package core;

class SyncExample{

	
		public static synchronized void loop() {  //method level lock if static synchronized then class level lock.
	
		 for(int i = 1; i<=5; i++) {
				
				System.out.println("hello youtube " + i);
				
				 try {
						Thread.sleep(1000);;
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
			}
		 
		
		 
	
		}
	
	
}

  
  class ClassAndObjectLevelLock {
	
	public static void main(String[] args) {
		
		SyncExample s1 = new SyncExample();
		SyncExample s2 = new SyncExample();
		ThreadDemo t1 = new ThreadDemo(s1);
		
		ThreadDemo t2 = new ThreadDemo(s2); //multiple thread accessing on same object 
		                                    // data inconsistency problem may occur so need to synchronized
		
	    t1.start();
        t2.start();
	}	
	
}
  
  
 class ThreadDemo extends Thread {
	  
	 SyncExample obj;
	 
	 
	 
	 public ThreadDemo(SyncExample obj) {
		
		this.obj = obj;
	}


	public void run() {
		
		obj.loop();
	}
  
  }
  
	
	




