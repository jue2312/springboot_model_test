import java.util.List;

public class Main {

    public static final int THREAD_NUMBER = 10;
    public static Integer num = 0;
    final static Integer lock = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread threads[] = new Thread[THREAD_NUMBER];

        for (int j = 0; j < THREAD_NUMBER; j++) {
            int finalJ = j;
            threads[j] = new Thread(() -> {threadLogic(finalJ);});
            threads[j].start();
        }

        for (int j = 0; j < THREAD_NUMBER; j++) {
            threads[j].join(); //todo add catch exception
        }

       System.out.println("********* The number is " + num + " *********");
   }

    public static void addOne(int id){
        // Critical Code
        synchronized (lock) {
            num = num + 1;
            System.out.println("add action thread " + id + ": " + num);
        }
    }

    public static void multiTwo(int id){
        // Critical Code
        synchronized (lock) {
            num = num * 2;
            System.out.println("multi action thread " + id + ": " + num);
        }
    }

    public static void threadLogic(int id){
        addOne(id);
        multiTwo(id);
    }
}