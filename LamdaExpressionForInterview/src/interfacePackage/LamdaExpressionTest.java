package interfacePackage;

public class LamdaExpressionTest
{
//    //静态内部类
//    static class person implements IPerson
//    {
//        @Override
//        public void persondo()
//        {
//            System.out.println("我已经很好的掌握了Lamda表达式......");
//        }
//    }

    public static void main(String[] args)
    {
//        //局部内部类
//        class person implements IPerson
//        {
//            @Override
//            public void persondo()
//            {
//                System.out.println("Lamda表达式is  so easy......");
//            }
//        }
//        //匿名内部类
//        IPerson p1 = new IPerson() {
//            @Override
//            public void persondo() {
//                System.out.println("LamdaExpression  does  not  so  difficult......");
//            }
//        };
       // person p1 = new person();

        //Lamda表达式
        IPerson p1 = ()->
         {
                System.out.println("LamdaExpression  does  not  so  difficult......");
         };
        p1.persondo();
    }
}





//外部实现类，实现了一个函数式接口
//class person implements IPerson
//{
//    @Override
//    public void persondo()
//    {
//        System.out.println("我已经掌握了Lamda表达式......");
//    }
//}