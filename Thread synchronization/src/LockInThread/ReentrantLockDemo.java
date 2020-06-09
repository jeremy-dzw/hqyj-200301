package LockInThread;
import java.util.concurrent.locks.ReentrantLock;
public class ReentrantLockDemo implements Runnable
{
    int ticketNumber = 20;
    //定义一个Lock锁
    ReentrantLock lock = new ReentrantLock();
    public static void main(String[] args)
    {
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        new Thread(reentrantLockDemo,"xx").start();
        new Thread(reentrantLockDemo,"yy").start();
        new Thread(reentrantLockDemo,"zz").start();
    }
    @Override
    public void run()
    {
        //lock.lock();
            if(ticketNumber > 0)
            {
                System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNumber-- +"张票...");
            }
            else
       // lock.unlock();
        return;
    }
}
