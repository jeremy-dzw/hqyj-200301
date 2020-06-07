package joinMethodAboutThreadForInterview;
/**join()方法的作用是让调用join()的线程立即执行并直到结束**/
public class joinMethodAboutThreadForInterviewDemo extends Thread
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"正在执行...");
    }
    public static void main(String[] args)throws Exception
    {
        joinMethodAboutThreadForInterviewDemo  joinMethodAboutThreadForInterviewDemo = new joinMethodAboutThreadForInterviewDemo();
        Thread t1 = new Thread(joinMethodAboutThreadForInterviewDemo,"jeremy");
        Thread t2 = new Thread(joinMethodAboutThreadForInterviewDemo,"lucy");
        Thread t3 = new Thread(joinMethodAboutThreadForInterviewDemo,"Tom");
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
    }
}
