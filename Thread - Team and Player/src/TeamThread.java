
 public class TeamThread extends Thread {
		Main threadMain;
		int numberOfPlayers;
		public TeamThread(Main threadMain, int numberOfPlayers) {
			super();
			this.threadMain = threadMain;
			this.numberOfPlayers = numberOfPlayers;
		}
		
		@Override
		 public void run() {
		      while (threadMain.value<numberOfPlayers) {
		    	  threadMain.value++;
		            threadMain.notify();
		        synchronized (threadMain) {
		            try {
		            	threadMain.wait();
		            } catch (InterruptedException e) {
		            	Thread.currentThread().interrupt();
		            }
		        }
		      }
		    }
	}

