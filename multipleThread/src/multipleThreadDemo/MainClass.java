package multipleThreadDemo;

public class MainClass
{
    public static void main(String[] args)
    {
        //创建一个线程对象
        ThreadDemo t1 = new ThreadDemo();

        //开启多线程
        t1.start();
        //主线程的任务

        for(int i=10;i>0;i--)
        {
            System.out.println("主线程来啦......");
        }
    }
}
