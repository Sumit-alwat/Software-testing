
package Projects;

class MyThread extends Thread {
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
//W.A.J.P to create one thread by extending Thread class in another class
public class Pr021 {
	
	public class ThreadExample {
	    public static void main(String[] args) {
	        MyThread thread = new MyThread();

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
}
