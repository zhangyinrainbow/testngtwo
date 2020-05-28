package chuji;

public class Student  extends person{
        int score;
        public Student(String name,int age,int score){
            super(name,age);
            this.score=score;
    }
    public int getScore(){
            return score;
    }
    @Override
    public void wolf(){
            super.wolf();
            System.out.println("这是子类的方法wolf");
    }
}
