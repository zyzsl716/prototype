package prototype.demo;


import java.util.Date;

//客户端：克隆
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException{
        //原型对象
        Date date = new Date();
        Video v1 = new Video("lalala", date);

        System.out.println("v1=>"+v1);
        System.out.println("v1=>hash:"+v1.hashCode());

        //v1可以克隆v2
        Video v2 = (Video) v1.clone(); //克隆出来的对象和原来的是一模一样的
        System.out.println("v2=>"+v2);
        System.out.println("v2=>hash:"+v2.hashCode());

        v2.setName("Clone:lalalal");
        System.out.println("v2=>"+v2);


        //上面的为浅克隆：两个会指向同一片内存区域，一个改变都会改变
    }
}
