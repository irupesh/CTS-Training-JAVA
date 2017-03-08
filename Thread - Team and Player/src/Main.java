import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	
	public static Queue<Integer> queue = new LinkedList<Integer>();
	 public  static int MAX_SIZE = 5;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of Players");
		int number = input.nextInt();

			
		TeamThread producer = new TeamThread(new Main(), number);
		PlayerThread consumer = new PlayerThread(new Main(), number);
		
		producer.start();
	    consumer.start();

	}

	
	
	
	static public class TeamThread extends Thread {
		Main threadMain;
		int numberOfPlayers;
		public TeamThread(Main threadMain, int numberOfPlayers) {
			super();
			this.threadMain = threadMain;
			this.numberOfPlayers = numberOfPlayers;
		}
		
		@Override
		 public void run() {
			int i=0;
		      while (i<numberOfPlayers) {
		        synchronized (queue) {
		          while (queue.size() == MAX_SIZE) {
		            try {
		              queue.wait();
		            } catch (InterruptedException e) {
		            	Thread.currentThread().interrupt();
		            }
		          }
		          queue.add(i++);
		          queue.notifyAll();
		        }
		      }
		    }
	}
	
	
	static public class PlayerThread extends Thread{
		Main threadMain;
		int numberOfPlayers;
		public PlayerThread(Main threadMain, int numberOfPlayers) {
			super();
			this.threadMain = threadMain;
			this.numberOfPlayers = numberOfPlayers;
		}
		
		public void run() {
			int i=0;
		      while (i<numberOfPlayers) {
		        synchronized (queue) {
		          while (queue.size() == 0) {
		            try {
		              queue.wait();
		            } catch (InterruptedException e) {
		            }
		          }

		          int element = queue.poll();
		          System.out.println("Player Thread " + element);
		          queue.notifyAll();
		        }
		        i++;
		      }
		    }
	}
		

}
