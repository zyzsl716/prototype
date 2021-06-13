package prototype.demo1;


import java.util.Date;

//客户端：克隆
public class Bilibili {
    public static void main(String[] args) throws CloneNotSupportedException{
        //原型对象
        Date date = new Date();
        Video v1 = new Video("lalala", date);
        Video v2 = (Video) v1.clone();

        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);

        date.setTime(22213123);

        System.out.println("v1=>"+v1);
        System.out.println("v2=>"+v2);



    }
}
