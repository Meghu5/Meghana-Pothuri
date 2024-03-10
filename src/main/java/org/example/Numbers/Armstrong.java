package org.example.Numbers;

public class Armstrong {

    public static void main(String args[]) {
      /*  Armstrong Number Example
        1: 11 = 1

        2: 21 = 2

    3: 31 = 3

            153: 13 + 53 + 33 = 1 + 125+ 27 = 153

            125: 13 + 23 + 53 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

            1634: 14 + 64 + 34 + 44 = 1 + 1296 + 81 + 256 = 1643 */
        int n=153;

        String a = Integer.toString(n);
        int b = a.length();
        char[] s = a.toCharArray();
        int c =(int)Math.pow(3,2);
  //      System.out.println(c);
            int m=0;
        for(int i=0;i<=s.length-1;i++){
             m=m+(int)Math.pow(Integer.parseInt(String.valueOf(s[i])),b);

}
        System.out.println(m);
        if(m==n){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}