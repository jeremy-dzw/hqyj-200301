package mySynchronizedTest;

public class mySynchronizedInBuyingTicket implements  Runnable
{   int ticketNumber = 500;
    public static void main(String[] args)
    {   mySynchronizedInBuyingTicket mySynchronizedInBuyingTicket = new mySynchronizedInBuyingTicket();
        Thread t1 = new Thread(mySynchronizedInBuyingTicket,"jeremy");
        Thread t2 = new Thread(mySynchronizedInBuyingTicket,"lucy");
        Thread t3 = new Thread(mySynchronizedInBuyingTicket,"黄牛");
        t1.start();
        t2.start();
        t3.start();
    }
    @Override
    public synchronized void run()
    {
        while(true)
        {   if(ticketNumber > 0)
            {
                System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNumber-- +"张票...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else
                break;
        }
        return;
    }
}
