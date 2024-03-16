
class MyClass extends Thread{
    @Override
    public void run() {
        for(int i=0;i<2;i++){
            try{
                Thread.sleep(300);
                System.out.println("The name of the current thread is: " + Thread.currentThread().getName());
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class JoinMethodExample {
    public static void main(String[] args) {
        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();
        MyClass t3 = new MyClass();
        t1.start();
        try{
            System.out.println("Name of the thread is: " + Thread.currentThread().getName());
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }

        t2.start();
        try{
            System.out.println("Name of the thread is: " + Thread.currentThread().getName());
            t2.join();
        }catch(Exception e){
            System.out.println(e);
        }

        t3.start();
    }
}
