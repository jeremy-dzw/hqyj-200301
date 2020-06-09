/**
 * (1)sleep是Thread中的方法，而wait是Object中的方法
 * (2)sleep不会释放锁，而wait会释放锁
 * (3)sleep是不依赖于synchronized代码块而存在，wait必须依赖同步代码块
 * (4)sleep不需要被唤醒，睡眠时间到，自动进入就绪状态等待CPU调度，而wait则需要调用notify被唤醒
 *
 * **/
package waitAndSleepTest;

public class waitAndSleepDemo implements  Runnable
{   //创建一个锁对象
    private static  final Object obj = new Object();
    public static void main(String[] args)
    {   waitAndSleepDemo waitAndSleepDemo = new waitAndSleepDemo();
        Thread t1 = new Thread(waitAndSleepDemo,"jeremy");
        t1.start();
        Thread t2 = new Thread(waitAndSleepDemo,"lucy");
        t2.start();
    }
    @Override
    public void run()
    {
//        try
//        {
//            Thread.sleep(3000);
//        } catch (InterruptedException e)
//        {
//            e.printStackTrace();
//        }
        synchronized (obj)
        {
            try {
                Thread.currentThread().wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程来啦...");
        }
    }
}
