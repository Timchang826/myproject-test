package com.tim;

public class scoring {
    public static void main(String[] args) {
        String[] names={"a","b","c","d","e"};
        int[] eng={100,90,80,70,60};
        int[] math={80,70,60,50,40};
        for (int i = 0; i < 5; i++) {
            if(i!=3) {
                int s;
                s = (math[i] + eng[i]) / 2;
                System.out.println(names[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + s);
            }
        }
    }
}
