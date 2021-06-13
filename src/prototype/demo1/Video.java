package prototype.demo1;

import java.util.Date;

//Video
public class Video implements Cloneable{
    private String name;
    private Date CreateTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj=super.clone();

        //实现深克隆
        Video v=(Video)obj;
        //将这个对象的属性也进行克隆：这样克隆出来的对象属性就不会指向同一片内存区域
        v.CreateTime =(Date)this.CreateTime.clone();
        return obj;
    }
    public Video(){

    }
    public Video(String name,Date CreateTime){
        this.name=name;
        this.CreateTime=CreateTime;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", CreateTime=" + CreateTime +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCreateTime(Date createTime) {
        this.CreateTime = createTime;
    }

    public String getName() {
        return name;
    }

    public Date getCreateTime() {
        return CreateTime;
    }
}
