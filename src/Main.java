public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(new Increment(counter));
        thread1.start();

        Thread thread3 = new Thread(new Increment2(counter));
        thread3.start();

        Thread thread2 = new Thread(new Increment(counter));
        thread2.start();


        Thread thread4 = new Thread(new Increment2(counter));
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        System.out.println("Number 1 :"+counter.count);
        System.out.println("Number 2 :"+counter.count2);
        counter.finish1 = counter.end1 - counter.start1;
        counter.finish2 = counter.end2 - counter.start2;
        System.out.println("Time 1: " + counter.finish1);
        System.out.println("Time 2: " + counter.finish2);




    }
}

class Increment implements Runnable {
    Counter counter;

    Increment(Counter counter) {
        this.counter = counter;

    }

    @Override
    public void run() {

        counter.add();

        counter.end1 = System.nanoTime();
    }

}

class Increment2 implements Runnable {
    Counter counter;

    Increment2(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {


        for (int i = 0; i < 100000; i++) {
            counter.add2();

        }
        counter.end2 = System.nanoTime();
    }
}

class Counter {
    long start1 = System.nanoTime();
    long start2 = System.nanoTime();
    long end1;
    long end2;
    long finish1;
    long finish2;
     int  count = 0;
    int count2 = 0;


   synchronized   public void add() {
        for (int i = 0; i < 100000; i++) {

            count++;

        }
    }

      public void add2() {
        count2++;
    }
}

