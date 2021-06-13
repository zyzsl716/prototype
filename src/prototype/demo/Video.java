package prototype.demo;

import java.util.Date;

//Video
public class Video implements Cloneable{
    private String name;
    private Date CreateTime;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
