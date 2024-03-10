package org.example.Collections;

public class Array_Asc_Desc_Order {
    int temp=0;
    int[] arr = new int[]{1,2,44,23};
    public static void main(String args[]){
Array_Asc_Desc_Order m = new Array_Asc_Desc_Order();
        m.asc();
        m.desc();
    }
    public void asc(){

        for (int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements in Ascending Order");
        for (int l =0;l<arr.length;l++){
            System.out.println(arr[l]);
        }

    }
    public void desc(){

        for (int i=0;i<=arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Elements in Descending Order");
        for (int l =0;l<arr.length;l++){
            System.out.println(arr[l]);
        }

    }


}
