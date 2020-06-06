//通过设置标志位来控制线程的停止
package stopThread;

public class stopThreadDemo
{   static int i= 0;
    boolean flag = true;
    public static void main(String[] args)
    {   class multipleThread implements Runnable
    {
        @Override
        public void run()
        {   while (true)
        {   if(i < 100)
        {
            System.out.println(Thread.currentThread().getName()+"正在计数"+i);
            i++;
        }
        else
            break;
        }
        }
    }
        //创建并开启线程
        multipleThread multipleThread= new multipleThread();
        Thread t = new Thread(multipleThread,"jeremy");
        t.start();
    }
    //定义一个线程内部类去实现Runnable接口

}