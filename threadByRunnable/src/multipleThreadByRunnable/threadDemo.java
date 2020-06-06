package multipleThreadByRunnable;

import java.sql.SQLOutput;

public class threadDemo implements Runnable
{
    @Override
    public void run()
    {
        for(int i = 200;i > 0;i--)
        {
            System.out.println("thread  son  is  coming......");
        }
    }
}
