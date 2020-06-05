package multipleThreadDemo;

public class ThreadDemo extends Thread
{
    @Override
    public void run()
    {
        for(int i = 10;i > 0;i--)
        {
            System.out.println("多线程来啦....");
        }
    }
}
