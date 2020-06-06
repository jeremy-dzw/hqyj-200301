package threadOfJoin;

public class joinMethodInThread implements Runnable
{
    public static void main(String[] args)
    {   joinMethodInThread joinMethodInThread = new joinMethodInThread();
        Thread thread1 = new Thread(joinMethodInThread,"jeremy");
        thread1.start();
        for (int i = 0;i<1000;i++)
        {   if(i==200)
            {
                try
                {
                    thread1.join();
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            System.out.println("主程序在运行......");
        }
    }
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"正在运行......");
    }
}
