package chuji;

public class pinggaitwo {
    public void jisuan(int money){
        int pijiu=money/2;
        int pingshen=pijiu;
        int pinggai=pijiu;
        int temp;
        int x=0;
        while(pingshen>=2||pinggai>=4){
            if((temp=pingshen/2)>0){
                pijiu=pijiu+temp;
                pingshen=temp+pingshen%2;
                pinggai=pinggai+temp;
            }
            if((temp=pinggai/4)>0){
                pijiu=pijiu+temp;
                pingshen=pingshen+temp;
                pinggai=temp+pinggai%4;
            }
            x+=1;
            System.out.println("循环第"+x+"次");
        }
        System.out.format("一共喝了%d瓶啤酒，剩余%d个瓶身，%d个瓶盖，一共循环了%d次",pijiu,pingshen,pinggai,x);
    }
}
