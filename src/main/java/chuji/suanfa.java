package chuji;

public class suanfa {
    public int jiafa(int a,int b){
        return a+b;
    }
    public double jiafa(double a,double b){
        return a+b;
    }
    public int jianfa(int a,int b){
        return a-b;
    }
    public int chufa(int a,int b){
        if(b==0){
            System.out.println("被除数不能为0");
            return 0;
        }else{
            return a/b;
        }
    }
}
