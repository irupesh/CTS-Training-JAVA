public class PlayerThread extends Thread{
		Main threadMain;
		int numberOfPlayers;
		public PlayerThread(Main threadMain, int numberOfPlayers) {
			super();
			this.threadMain = threadMain;
			this.numberOfPlayers = numberOfPlayers;
		}
		
		public void run() {
		      while (threadMain.value<numberOfPlayers) {
		        synchronized (threadMain) {
		            try {
		            	threadMain.wait();
		            } catch (InterruptedException e) {
		            }
		          System.out.println("Player Thread " + threadMain.value);
		          threadMain.notify();
		        }
		      }
		    }
	}