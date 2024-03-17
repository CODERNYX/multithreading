public class DaemonThreadExample extends Thread{
    @Override
    public void run() {
        if(Thread.currentThread().isDaemon()){
            System.out.println("The given thread " + Thread.currentThread().getName() + " is a daemon thread");
        }
        else{
            System.out.println("The given thread " + Thread.currentThread().getName() + " is a user thread");
        }
    }

    public static void main(String[] args) {
        DaemonThreadExample t1 = new DaemonThreadExample();
        DaemonThreadExample t2 = new DaemonThreadExample();
        DaemonThreadExample t3 = new DaemonThreadExample();
        //You have set the thread to daemon then only you can start
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
        //If you start the thread and then set it to daemon, JVM will throw IllegalThreadStateException
    }
}
