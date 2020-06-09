package UnsafeByTicketDemo;
/**(1)同一个对象被多个线程并发操作，会产生安全性问题；解决此问题可以采用线程的同步机制
 * （也叫做线程的等待机制）；
 * (2)同步机制的实现需要（队列+锁）
 *(3) CPU在调度的时候，已经实现了队列的问题，我们需要做的就是解决锁的问题
 *(4)每一个对象都有一把锁
 * (5)同步方法有缺陷，所以，又有了同步代码块来解决线程同步的问题
 * (6)线程获得锁--->执行临界区代码--->访问共享数据--->释放锁对象
 * (7)java中的每一个对象都有一个关联的内部锁
 * **/
public class UnsafeByTicketDemo
{
    public static void main(String[] args)
    {
        BuyTicket buyTicket = new BuyTicket();
        Thread t1 = new Thread(buyTicket,"jeremy");
        Thread t2 = new Thread(buyTicket,"lucy");
        Thread t3 = new Thread(buyTicket,"Tom");
        t1.start();
        t2.start();
        t3.start();
    }
}
class BuyTicket implements Runnable
{   private int ticketNumber =20;
    boolean flag = true;
    @Override
    public void run()
    {
        while(flag)
        {
            try
            {
                buy();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

    }
    private synchronized void buy()throws Exception
    {
        if(ticketNumber <= 0)
        {
            flag = false;
            return;
        }
        System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNumber-- +"张票...");
    }
}