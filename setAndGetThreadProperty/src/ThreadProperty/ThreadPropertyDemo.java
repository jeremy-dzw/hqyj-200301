package ThreadProperty;
/**线程的优先级中，最高优先级是10，最低优先级是1
 * 默认的主线程优先级是5
 * 优先级的高低与线程执行的先后顺序没有必然关系，会存在性能倒置的情况[优先级低只是获得调度的概率低，并不是优先级低就不会被调用了]
 * 线程优先级的设置一定是在线程运行之前
 * **/
public class ThreadPropertyDemo implements Runnable
{
    public static void main(String[] args)
    {
        System.out.println(Thread.currentThread().getPriority());
        ThreadPropertyDemo  threadPropertyDemo = new ThreadPropertyDemo();
        Thread t1 = new Thread(threadPropertyDemo,"jeremy");
        Thread t2 = new Thread(threadPropertyDemo,"lucy");
        Thread t3 = new Thread(threadPropertyDemo,"Tom");
        t1.setPriority(1);
        t2.setPriority(10);
        t3.setPriority(6);
        t1.start();
        t2.start();
        t3.start();
    }
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+"--->"+Thread.currentThread().getPriority()+" "+"正在执行...");
    }
}
