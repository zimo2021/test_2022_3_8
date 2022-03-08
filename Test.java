package javatest;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.CancellationException;

//局部内部类
//class Outter{
//    private int a=10;
//    private int b=20;
//    public void method(){
//        class inner{
//            public void show(){
//                System.out.println(a);
//                System.out.println(b);
//            }
//        }
//        inner i=new inner();//必须借助对象调用内部类
//        i.show();
//    }
//}
//
//public class Test {
//    public static void main(String[] args) {
//        Outter o=new Outter();//10
//        o.method();//20
//    }
//}

//匿名内部类
/*
前提：存在一个类（可以是具体类或抽象类）或者接口
格式：new 类名或接口名{
        重写方法；
        }；
 本质：一个继承了该类或者实现了该接口的匿名对象
 */

//interface inner{
//    void show();
//}
//class Outter{
//    private int a=10;
//    public void method(){
////        new inner(){
////            @Override
////            public void show() {
////                System.out.println("匿名内部类");
////            }
////        }.show();//这个相当于创建了一个inner的匿名对象 可以直接调用方法
//
//       inner i= new inner(){//用inner类型的i接收匿名对象
//            @Override
//            public void show() {
//                System.out.println("匿名内部类");
//            }
//        };
//       i.show();//匿名内部类
//       i.show();//匿名内部类
//    }
//}
//
//
//public class Test {
//    public static void main(String[] args) {
//        Outter o=new Outter();
//        o.method();//匿名内部类
//    }
//}

//匿名内部类在开发中的使用
//interface inter{
//    void jump();
//}
//class tes{
//    public void method(inter i){
//        i.jump();//猫可以跳高了
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        tes t=new tes();
//        t.method(new inter() {
//            @Override
//            public void jump() {
//                System.out.println("猫可以跳高了");//以匿名内部类作为实参 这样就不用定义inter接口的实现类了
//            }
//        });
//    }
//}


//API:Math
//public class Test{
//    public static void main(String[] args) {
//        //abs:放回绝对值（可以是整形，浮点型等）
//        System.out.println(Math.abs(88));
//        System.out.println(Math.abs(-88));
//        //ceil:
//        System.out.println(Math.ceil(12.12));//13  放回大于或等于12.12的最小整数
//        //floor
//        System.out.println(Math.floor(12.12));//12 放回小于或等于12.12的最小整数
//        //round
//        System.out.println(Math.round(12.12));//12 四舍五入返回整数
//        System.out.println(Math.round(12.5));//13
//        System.out.println(Math.round(12.45));//12
//        //max
//        System.out.println(Math.max(10,20));//20 返回两个数中的最大值
//        //min
//        System.out.println(Math.min(10,20));//10  返回两个值中的最小值
//        //pow
//        System.out.println(Math.pow(2,6));//64.0 返回2的六次方
//        //random
//        System.out.println(Math.random());//0.4800996168016295
//        System.out.println(Math.random());//0.21685311719796674 返回0到1（不包括1）间任意double类型整数
//        System.out.println(Math.random()*1000);//262.0733715264778 0到1000中任意值（不包括1000）
//    }
//}


//API：System
//public class Test{
//    public static void main(String[] args) {
//        System.out.println(10);
//        //System.exit(0);//推出程序
//        System.out.println(20);
//        System.out.println(System.currentTimeMillis());//1646543789082 返回从1970年到现在共有多少毫秒
//        System.out.println(System.currentTimeMillis()*1.0/1000/60/60/24/365);//52.21156370243531年
//        //计算程序运行时间
//        long start=System.currentTimeMillis();
//        for(int i=0;i<10000;i++){
//            System.out.println(i);
//        }
//        long end=System.currentTimeMillis();
//        System.out.println((end-start)+"毫秒");//47毫秒
//    }
//}


//Object类中toString方法（Object类  所有类的公共祖先类）
//class Student{
//    private int age;
//    private String name;
//
//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public Student() {
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//      //自动生成：ALT+insert 选中toString
////    @Override
////    public String toString() {//toString是Object中的方法 我们定义的类可以重写此方法 方便后面的操作
////        return "Student{" +
////                "age=" + age +
////                ", name='" + name + '\'' +
////                '}';
////    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Student s=new Student();
//        s.setName("林青霞");
//        s.setAge(20);
//        System.out.println(s);//javatest.Student@b4c966a 这是没有重写toString方法的情况 可以按ctrl+b查看源码
//        System.out.println(s);//Student{age=20, name='林青霞'} 这就是重写toString的好处 可以直接输出对象
//    }
//}


//Object类中equals方法：比较对象是否相等 默认比较地址 可以重写equals方法 自动生成（alt+insert）
//class student{
//    private int age;
//    String name;
//
//    public student() {
//    }
//
//    public student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    //按alt+insert 选equals()and hashCode() 选default模板 一直下一步 完成即可
//    @Override
//    public boolean equals(Object o) {
//        //地址值相同 为同一对象 返回true
//        if (this == o) return true;
//        //两对象不是同一类型 返回false
//        if (o == null || getClass() != o.getClass()) return false;
//
//        student student = (student) o;
//        //年龄不同 返回false
//        if (age != student.age) return false;
//        //姓名不同 返回flase 相同返回true
//        return name != null ? name.equals(student.name) : student.name == null;
//    }
//}
//S
//public class Test {
//    public static void main(String[] args) {
//        student s1=new student(20,"林青霞");
//        student s2=new student(20,"林青霞");
//        System.out.println(s1.equals(s2));//true
//    }
//}

//注：在类中使用static修饰的变量或者方法可以直接用类名加”.“调用
//class student{
//    public static int age;
//    public static void show(){
//        System.out.println("show方法的静态调用");
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        student.age=10;
//        System.out.println(student.age);//10
//        student.show();//show方法的静态调用
//    }
//}

//Arrays 中toStrin方法和sort方法
//public class Test {
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 3, 5, 1};
////        Arrays.toString(arr);
////        System.out.println(arr);//错误 此时arr是一个地址值
//        System.out.println("排序前："+ Arrays.toString(arr));//排序前：[2, 4, 3, 5, 1]
//        Arrays.sort(arr);
//        System.out.println("排序后："+Arrays.toString(arr));//排序后：[1, 2, 3, 4, 5]
//
//    }
//}

//基本类型包装类
/*
将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据
常用操作之一：用于基本数据类型和字符串之间的转换
一些基本数据类型以及他到底包装类：byte(Byte), short( Short),int(Interger),long(Long),float(Float),double(Double),
char(Character),boolean(Boolean)
 */
//public class Test {
//    public static void main(String[] args) {
//        //public static final int MAX_VALUE
//        System.out.println(Integer.MAX_VALUE);//即2的31次方减1 2147483647
//        //public static final int MIN_VALUE
//        System.out.println(Integer.MIN_VALUE);//即2的31次方  -2147483648
//    }
//}


//Interger构造
//public class Test {
//    public static void main(String[] args) {
////        Integer i=new Integer(100);//100
////        System.out.println(i);
////        Integer i1=new Integer("100");//100  用 new Integer()已经过时
////        System.out.println(i1);
////        Integer i2=new Integer("abc");
////        System.out.println(i2);//NumberFormatException 必须是数字字符串
//        Integer i=Integer.valueOf(100);
//        Integer i1=Integer.valueOf("100");
//        System.out.println(i);
//        System.out.println(i1);
//        Integer i2=Integer.valueOf("abc");
//        System.out.println(i2);////NumberFormatException 必须是数字字符串
//    }
//}

//int和String之间的类型转换
//public class Test {
//    public static void main(String[] args) {
//        //int 转String
//        //方式一
//        int a=100;
//        String s=""+a;
//        System.out.println(s);//100
//        //方式2
//        String s1=String.valueOf(a);
//        System.out.println(s1);//100
//        //String转int
//        //方式一 String---Integet---int
//        String s2="100";
//        Integer i=Integer.valueOf(s2);
//        int i1=i.intValue();
//        System.out.println(i1);
//        //方式二 String---int
//        int i2=Integer.parseInt(s);
//        System.out.println(i2);
//    }
//}

//字符串中数据排序
//给出一个字符串“50 20 40 30 10” 要求输出“10 20 30 40 50”
//public class Test {
//    public static void main(String[] args) {
//        String s="50 20 40 30 10";
//        String[] s1=s.split(" ");//根据“  ”分离字符串到s1中
////        for(int i=0;i<s1.length;i++){
////            System.out.println(s1[i]);
////        }//测试是否分离成功
//        int[] arr=new int[s1.length];
//        for(int i=0;i<s1.length;i++){
//            arr[i]=Integer.parseInt(s1[i]);
//        }
//        Arrays.sort(arr);
//        StringBuilder sb=new StringBuilder();
//        for(int i=0;i<arr.length;i++){
//            if(i==arr.length-1){
//                sb.append(arr[i]);
//                break;
//            }
//            sb.append(arr[i]).append(" ");//尾部追加
//        }
//        String ans=sb.toString();
//        System.out.println(ans);//10 20 30 40 50
//    }
//}

//自动装箱和拆箱
//装箱：把基本数据类型转换为对应的包装类类型
//拆箱：把包装类类型转换为基本数据类型
//public class Test {
//    public static void main(String[] args) {
//        Integer i = Integer.valueOf(100);//手动装箱
//        Integer ii=100;//自动装箱 内含Integer i = Integer.valueOf(100);
//        System.out.println(ii);//100
//        Integer iii=ii.intValue()+100;
//        System.out.println(iii);//200
//        iii+=100;//内含自动拆箱和装箱 相当于Integer iii=ii.intValue()+100; 其中ii.intValue() 就是拆箱操作 加上100后自动装箱
//        System.out.println(iii);//300
//    }
//}

//Date类
/*
构造方法
public Date();
public Date(long date); 其中date以毫秒为单位
 */

//public class Test {
//    public static void main(String[] args) {
//        Date d=new Date();
//        System.out.println(d);//Mon Mar 07 14:38:28 CST 2022 解释：cst:中国时间 2022年 3月7日14:38:28 mon:星期一
//        long dd=1000*60*60;
//        Date ddd=new Date(dd);
//        System.out.println(ddd);//Thu Jan 01 09:00:00 CST 1970  解释：以1970年1月一日0时0分开始 因为我们是东八区 加八小时在加dd一小时
//    }
//}

//Date中的getTime() 和setTime()方法
//public class Test {
//    public static void main(String[] args) {
//        Date d=new Date();
//        System.out.println(d.getTime());//1646635652230 从标准时间到现在过去的毫秒值 和System.currentTimeMillis();相似
//        long time=1000*60*60;
//        d.setTime(time);
//        System.out.println(d);//Thu Jan 01 09:00:00 CST 1970 以1970年1月一日0时0分开始 因为我们是东八区 加八小时在加time一小时
//    }
//}

//simpleDateFormat类
/*
构造方法：
public SimpleDateFormat();构造一个SimpleDateFormat，使用默认模式和日期模式
public SimpleDateFormat(String pattern);构造一个SimpleDateFormat，使用给定的模式和默认的日期格式
格式化 从Date到String
public final static format(Date date);
解析：从String 到Date
public Date parse(String source);从给定字符串解析文本以生成日期
 */
//public class Test {
//    public static void main(String[] args) throws ParseException {//抛出异常
//        //format方法
//        SimpleDateFormat sdf=new SimpleDateFormat();
//        Date d=new Date();
//        String s=sdf.format(d);
//        System.out.println(s);//2022/3/7 下午3:09 将Date类型转换为String类型
//        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss");//2022年03月07日 15：12:24
//        //至于上面的yyyy MM等代表什么 可以去docs.oracle.com 查SimpleDateFormat
//        s=sdf2.format(d);
//        System.out.println(s);
//        //parse方法
//        String ss="2022年03月07日 15：12:24";
//        SimpleDateFormat sd=new SimpleDateFormat("yyyy年MM月dd日 HH：mm:ss");
//        Date dt=new Date();
//        dt=sd.parse(ss);//这里要按ale+enter 选方法异常 具体原因不明
//        System.out.println(dt);//Mon Mar 07 15:12:24 CST 2022 将字符串转化为Date类型
//
//    }
//}

//创建一个时间工具类 只需传入一个String 类型参数 和Date类型参数就可以相互转换
//class DateUtils {
//    //既然是一个工具类 则构造方法私有（保证不能用创建对象）  成员方法静态（可以直接通过类名调用）
//    private DateUtils(){}
//    public static String DatetoString(Date d, String s) {
//        SimpleDateFormat spf= new SimpleDateFormat(s);
//        String ss=spf.format(d);
//        return ss;
//    }
//     public static Date StringtoDate(String format,String s) throws ParseException {
//         SimpleDateFormat spf= new SimpleDateFormat(format);//注意 这里的s 和format格式必须匹配（即 如果ss中用-连接
//         // format中也用-连接个字符
//         Date dd=spf.parse(s);
//         return dd;
//     }
//}
//
//public class Test {
//    public static void main(String[] args) throws ParseException {
//        //DateUtils du=new DateUtils();//报错 DateUtils中构造函数为private权限 不能创建对象
//        Date d=new Date();
//        String s=DateUtils.DatetoString(d,"yyyy年MM月dd日 HH:mm:ss");
//        System.out.println(s);//2022年03月07日 17:54:20
//        String ss="2018-11-11 11:11:11";
//        Date dd=DateUtils.StringtoDate("yyyy-MM-dd HH:mm:ss",ss);
//        System.out.println(dd);//Sun Nov 11 11:11:11 CST 2018
//    }
//}

//Calendar：日历
//public class Test {
//    public static void main(String[] args) {
//        Calendar cal=Calendar.getInstance();//getInstance为Canlendar中的一个静态方法 其返回值为Calendar类型
//        System.out.println(cal);
//        int yeah = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH);
//        int day = cal.get(Calendar.DATE);
//        System.out.println(yeah+"年"+month+"月"+day+"日");//2022年2月7日
//    }
//}

//Calendar常用方法(get方法，add方法，set方法)
//public class Test {
//    public static void main(String[] args) {
//        Calendar ca=Calendar.getInstance();
////        int yeah = ca.get(Calendar.YEAR);
////        int month = ca.get(Calendar.MONTH);
////        int date = ca.get(Calendar.DATE);
////        System.out.println(yeah+"年"+month+"月"+date+"日");//2022年2月8日 注意：month是从0开始算的 所以现在是2022年3月8日
//        //向后加十年
////        ca.add(Calendar.YEAR,10);
////        int yeah = ca.get(Calendar.YEAR);
////        int month = ca.get(Calendar.MONTH);
////        int date = ca.get(Calendar.DATE);
////        System.out.println(yeah+"年"+(month + 1)+"月"+date+"日");//2032年3月8日
//
////        ca.add(Calendar.DATE,10);
////        int yeah = ca.get(Calendar.YEAR);
////        int month = ca.get(Calendar.MONTH);
////        int date = ca.get(Calendar.DATE);
////        System.out.println(yeah+"年"+(month + 1)+"月"+date+"日");//2022年3月18日
//
//        ca.set(2018,11,11);
//        int yeah = ca.get(Calendar.YEAR);
//        int month = ca.get(Calendar.MONTH);
//        int date = ca.get(Calendar.DATE);
//        System.out.println(yeah+"年"+(month + 1)+"月"+date+"日");//2018年12月11日 一样的
//
//    }
//}















