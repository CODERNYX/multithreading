
//Thread Creation Example 1
/*public class ThreadCreationExample extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running with extending Thread class");
    }

    public static void main(String[] args) {
        ThreadCreationExample t1 = new ThreadCreationExample();
        t1.start();
    }
}*/

//Thread Creation Example 2
/*
public class ThreadCreationExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running using Runnable Interface");
    }

    public static void main(String[] args) {
        ThreadCreationExample t2 = new ThreadCreationExample();
        Thread t = new Thread(t2);
        t.start();
    }
}
*/

//Thread Creation Example 3
/*
public class ThreadCreationExample{
    public static void main(String[] args) {
        Thread t = new Thread("First Thread");
        t.start();
        System.out.println(t.getName());
    }
}*/

//Thread Creation Example 4
public class ThreadCreationExample implements Runnable{

    @Override
    public void run() {
        System.out.println("Now the thread is running");
    }

    public static void main(String[] args) {
        Runnable r1 = new ThreadCreationExample();
        Thread t = new Thread(r1,"First Thread");
        t.start();
        System.out.println(t.getName());
    }
}