package chuji;
/*啤酒2元一瓶,4个瓶盖可以换一瓶啤酒,2个空瓶可以换一瓶啤酒，80块钱可以喝多少平啤酒*/

public class pinggaione {
    public static void main(String[] args) {
        int money = 80;
        int pijiu =40;
        int pinggai = 40;
        int pingshen = 40;
        int temp;
        int y=0;
        while (pinggai / 4 > 0 || pingshen / 2 > 0) {
            if((temp=pinggai/4)>0){
                pijiu=pijiu+temp;
                pinggai=temp+pinggai%4;
                pingshen=temp+pingshen;
            }
            if((temp=pingshen/2)>0){
                pijiu=pijiu+temp;
                pinggai=pinggai+temp;
                pingshen=temp+pingshen%2;
            }
            y=y+1;
            System.out.println(temp);
            System.out.println(y);
        }
        System.out.format("一共喝了%d瓶啤酒，还剩余%d个瓶盖%d个瓶身,共循环了%d次",pijiu,pinggai,pingshen,y);
    }
}


