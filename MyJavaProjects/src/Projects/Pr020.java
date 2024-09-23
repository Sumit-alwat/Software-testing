
package Projects;
//W.A.J.P to create one thread by implementing Runnable interface in class

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
public class Pr020 {
	 public static void main(String[] args) {
	        MyRunnable myRunnable = new MyRunnable();

	        Thread thread = new Thread(myRunnable);
	        thread.start();

	        for (int i = 1; i <= 5; i++) {
	            System.out.println("Main thread is running: " + i);
	            try {
	                Thread.sleep(3000);
	            } catch (InterruptedException e) {
	                System.out.println("Main thread interrupted.");
	            }
	        }
	    }
}
