public class ThreadEx extends Thread{

    public void run(){
        System.out.println("Thread 2");
    }

    public static void main(String[] args) {
        System.out.println("Thread 1");

        ThreadEx threadEx = new ThreadEx();
        threadEx.start();
    }
}