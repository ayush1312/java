public class MultiThread implements Runnable{
    private static int count=1;
    int remainder;
    static Object lock = new Object();

    public MultiThread(int remainder) {
        this.remainder = remainder;
    }

    public static void main(String args[]) {
        MultiThread mOdd = new MultiThread(1);
        MultiThread mEven = new MultiThread(0);
        Thread t1 = new Thread(mOdd);
        Thread t2 = new Thread(mEven);
        t1.setName("odd");
        t2.setName("even");
        t1.start();
        t2.start();
    }

    @Override
    public  void run() {
        System.out.println("thread is " + Thread.currentThread().getName());
        while (count <11) {
            synchronized (lock) {
                    if (count % 2 != remainder) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " > " + count++);
                lock.notifyAll();
            }
        }
    }
}
