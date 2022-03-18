package com.tim.Shop;

public class Vipnormal {
    String name;
    int originalmoney;
    int money;
    int backmoney;
    public Vipnormal(String name, int money){
        this.originalmoney=money;
        this.name=name;
        this.money=money-(money/1000)*100;

    }


    public void print(){
        System.out.println(name + "\t" + originalmoney + "\t" + money );
    }

}
