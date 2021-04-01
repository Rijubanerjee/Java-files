package Lab2;

import java.util.Scanner;

public class Exercise4 {
	public static int modifyArray(int arr[]){  
			int n = a.length;
	        if (n==0 || n==1){  
	            return n;  
	        }  
	        int[] temp = new int[n];  
	        int j = 0;  
	        for (int i=0; i<n-1; i++){  
	            if (arr[i] != arr[i+1]){  
	                temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];       
	        for (int i=0; i<j; i++){  
	            arr[i] = temp[i];  
	        }  
	        return j;  
	    }  
	       
	    public static void main (String[] args) {  
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter the array:");
			int[] a = new int [10];
			for (int i = 0; i < 10; i++)
			{
				a [i] = sc.nextInt();		
			}
			int length;
	        length = modifyArray(a);  
	        for (int i=0; i<length; i++)  
	           System.out.print(a[i]+" ");  
	    }  
    }  

