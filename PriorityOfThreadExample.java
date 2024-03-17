public class PriorityOfThreadExample extends Thread {
    @Override
    public void run() {
        System.out.println("Inside the run() method");
    }

    public static void main(String[] args) {
        PriorityOfThreadExample t1 = new PriorityOfThreadExample();
        PriorityOfThreadExample t2 = new PriorityOfThreadExample();
        PriorityOfThreadExample t3 = new PriorityOfThreadExample();

        //Getting the priority of user threads using getter methods of thread priority
        System.out.println("Priority of t1: " + t1.getPriority());
        System.out.println("Priority of t2: " + t2.getPriority());
        System.out.println("Priority of t3: " + t3.getPriority());

        //Setting the priority of user threads using setter methods of thread priority
        t1.setPriority(6);
        t2.setPriority(3);
        t3.setPriority(9);
        System.out.println("Priority of t1 after using setter method: " + t1.getPriority());
        System.out.println("Priority of t2 after using setter method: " + t2.getPriority());
        System.out.println("Priority of t3 after using setter method: " + t3.getPriority());
        System.out.println("Currently Executing thread: " + Thread.currentThread().getName());
        System.out.println("Priority of the main thread: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("Priority of the main thread after using setter method: " + Thread.currentThread().getPriority());
    }
}
