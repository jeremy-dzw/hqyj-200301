package operator;
/**
 *与  或  非  异或   短路与   短路或
 *instanceof():运算符左边的实例对象不能是基本数据类型；左边的对象和右边的类必须不在同一个继承树上
 *java中的数据类型，只有类、接口、数组是引用数据类型，其他的全为基本数据类型
 * **/
public class operatorDemo
{
    public static void main(String[] args)
    {   operatorDemo operatorDemo = new operatorDemo();
        boolean b1 = true;
        boolean b2 = false;
        boolean k = operatorDemo instanceof operatorDemo;
        System.out.println(b1&b2);//false
        System.out.println(b1|b2);//true
        System.out.println(!b1);//false
        System.out.println(b1^b2);//true
        System.out.println((b1&b2)&&b2);//false
        System.out.println((b1|b2)||b2);//true
        System.out.println(k);//true
    }

}
