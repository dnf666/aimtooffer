package thread;

/**
 * created by dailf on 2018/9/25
 *
 * @author dailf
 */
public class DeadLock {
    public static void main(String[] args) {
        LockDemo A = new LockDemo(true);
        LockDemo B = new LockDemo(false);
        new Thread(A).start();
        new Thread(B).start();
    }
}


class LockDemo implements Runnable {
    public static final Object AAA = new Object();
    public static final Object BBB = new Object();
    boolean flag;
    public LockDemo(boolean flag) {
        this.flag = flag;
    }
    @Override
    public void run() {
        if(flag) {
            synchronized (AAA) {
                System.out.println("if   lock  AAA");
                try {
                    Thread.sleep(1000);
                    synchronized (BBB) {
                        System.out.println("if   lock  BBB");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
        else{
            synchronized (BBB) {
                System.out.println("else   lock  BBB");
                try {
                    Thread.sleep(1000);
                    synchronized (AAA) {
                        System.out.println("else   lock  AAA");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}


