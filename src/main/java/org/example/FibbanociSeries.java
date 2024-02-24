package org.example;
public class FibbanociSeries {

    public static void main (String args[]){

        int prev=0, sum =0,next=1;
        for(int i=0;i<10;i++){

            System.out.print(sum+" ");
            prev=next;
            next=sum;
            sum=prev+next;
        }
    }
}