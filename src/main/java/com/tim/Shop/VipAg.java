package com.tim.Shop;

public class VipAg {
    String name;
    int originalmoney;
    int money;
    int backmoney;
    public VipAg(String name,int money){
        this.originalmoney=money;
        this.name=name;
        this.money=money-(money/1000)*100;
        this.backmoney=(money/1000)*100;

    }

    public void print(){
        System.out.println(name+ "\t" + originalmoney + "\t" + money + "\t" + "("+backmoney+")");
    }
}
