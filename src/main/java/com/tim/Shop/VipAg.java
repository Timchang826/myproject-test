package com.tim.Shop;

public class VipAg extends Vipnormal {
    int backmoney;
    int originalmoney;
    public VipAg(String name,int money){
        super(name, money);
        this.originalmoney=money;
        this.backmoney=(money/1000)*100;

    }

    public void print(){
        System.out.println(name+ "\t" + originalmoney + "\t" + money + "\t" + "("+backmoney+")");
    }
}
