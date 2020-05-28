package chuji;

public class son extends father implements godMother{
    @Override
    public String name(){
        return "wangwei";
    }
    public void zuozhenxian(){
        System.out.println("zuozhenxian");
    }
    public String daodao(){
        return "还是挺能说的";
    }
    public int sancan(){
        return 3;
    }
}
