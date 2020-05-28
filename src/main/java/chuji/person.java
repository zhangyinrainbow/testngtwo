package chuji;

public class person {
    String name;
    int age;
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void wolf(){
        System.out.println("这是父类的方法wolf");
    }
}
