package p2;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Taking Size of an Array as input
			
			System.out.println("Enter the Size of the Array: ");
			
			int n = sc.nextInt();
			
			int a[] = new int[n];
			
			// Taking Array Elements as Input from the User
			
			System.out.println("Enter the Array elements: ");
			
			for(int i=0; i<n; i++) {
				
				a[i] = sc.nextInt();
			}
			
			// Displaying Array elements
			
			System.out.print("Array elements are: ");
	 
			for(int k: a) {
				
				System.out.print(k+" ");
			}
			
			// Sorting 
			
			for(int i=0; i<n-1; i++) {
				
				for(int j=0; j<n-i-1; j++) {
					
					if(a[j] > a[j+1]) {
						
						int temp = a[j];
						
						a[j] = a[j+1];
						
						a[j+1] = temp;
					}
				}
			}
			
			// Displaying Sorted Array
			
			System.out.print("\nSorted Array is: ");
			
			for(int m: a) {
				
				System.out.print(m+" ");
			}

		}catch(Exception e) {
			
			System.out.println("Please Enter a Valid Input");
		}	
	}
}
