package org.example.Numbers;

public class PrimeNumbers {

   static int m =101, count=0;

    public static void main(String args[]){

        for(int i=1;i<=m;i++) {
            if (m % i == 0) {
                count++;
            }
        }
            if(count==2){
                System.out.println(m+" is a prime number");
            }
            else{
                System.out.println(m+" is a not a prime number");
            }


        }

}
