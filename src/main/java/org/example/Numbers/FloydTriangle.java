package org.example.Numbers;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int i,n=10,j, k=1;
	        for (i = 1; i <= n; i++) {
	 
	            // Inner loop for columns
	            for (j = 1; j <= i; j++) {
	 
	                // Printing value to be displayed
	                System.out.print(k + "  ");
	 
	                // Incrementing value displayed
	                k++;
	            }
	 
	            // Print elements of next row
	            System.out.println();
	            
	            
	        }
	   
		
		

	}

}
