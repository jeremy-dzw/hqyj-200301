package ThreadOfTimer;
//线程模拟倒计时
public class threadTimerDemo  implements  Runnable
{
    public static void main(String[] args)
    {   threadTimerDemo threadTimerDemo = new threadTimerDemo();
        Thread thread = new Thread(threadTimerDemo,"jeremy");
        thread.start();
    }
    @Override
    public void run()
    {   int number = 10;
        while(true)
        {
            if(number > 0)
            {
                System.out.println(Thread.currentThread().getName()+"----->"+number);
                number--;
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            else
                break;
        }
    }
}
