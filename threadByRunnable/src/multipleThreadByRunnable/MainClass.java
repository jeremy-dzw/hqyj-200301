package multipleThreadByRunnable;

public class MainClass
{
    public static void main(String[] args)
    {   threadDemo t = new threadDemo();
        Thread t1 = new Thread(t);
        t1.start();
        for(int i = 200;i > 0;i--)
        {
            System.out.println("主线程来啦......");
        }
    }
}
