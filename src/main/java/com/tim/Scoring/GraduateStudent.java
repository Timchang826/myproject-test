package com.tim.Scoring;

public class GraduateStudent extends Student {
    int thesis;
    public GraduateStudent(String name,int eng,int math,int thesis){

        super(name, eng, math);
        this.thesis=thesis;
    }
    public void print(){
        int average = (eng+math)/2;
        System.out.print(name + "\t" + eng + "\t" + math +"\t" + average + "\t" +thesis);
        if(average<70){
            System.out.print("*");
        }
        System.out.println();
    }
}
