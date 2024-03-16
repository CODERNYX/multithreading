
//Making user defined thread sleep for a period of time
/*
public class SleepMethodExample extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            try{
                Thread.sleep(500);
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        SleepMethodExample t1 = new SleepMethodExample();
        SleepMethodExample t2 = new SleepMethodExample();
        t1.start();
        t2.start();
    }
}
*/

//Making the main thread sleep
public class SleepMethodExample{
    public static void main(String[] args) {
        try{
            for(int i = 0;i < 5; i++){
                Thread.sleep(1000);
                System.out.println(i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
// If we give negative number for sleep() method then it will throw IllegalArgumentException