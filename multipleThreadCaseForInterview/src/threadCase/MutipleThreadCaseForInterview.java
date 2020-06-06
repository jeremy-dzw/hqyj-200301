package threadCase;
/**
 * 多线程并发处理同一个资源时，存在问题
 * **/
public class MutipleThreadCaseForInterview implements Runnable
{   int ticketNumber = 20;
    @Override
    public void run()
    {
        while(true)
        {
            if(ticketNumber > 0)
                System.out.println(Thread.currentThread().getName()+"拿到了第"+ticketNumber-- +"张票");
            else
                break;
        }
    }
    public static void main(String[] args)
    {
        MutipleThreadCaseForInterview t= new MutipleThreadCaseForInterview();
        Thread t1 = new Thread(t,"小明");
        Thread t2 = new Thread(t,"小红");
        Thread t3 = new Thread(t,"黄牛党");
        t1.start();
        t2.start();
        t3.start();
    }
}
