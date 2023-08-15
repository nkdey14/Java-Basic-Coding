package p2;

import java.util.Scanner;

public class Demo {
	
	Scanner sc1 = new Scanner(System.in);
	
	public void reverse() {
		
		try {
			
			System.out.println("Enter a String: ");
			
			String s = sc1.nextLine();
			
			String rev = "";
			
			for(int i = s.length()-1; i>=0; i--) {
				
				rev += s.charAt(i);
			}
			
			System.out.println("Reverse String is: "+ rev);
			
		} catch(Exception e) {
			
			System.out.println("Please Enter a Valid input");
		}
		
	}
	
	public void findPalindrome() {
		
		String s = "";
		String rev = "";
		
		try {
			
			System.out.println("Enter a String: ");
			
			s = sc1.nextLine();
						
			for(int i = s.length()-1; i>=0; i--) {
				
				rev += s.charAt(i);
			}
			
	//		System.out.println("Reverse String is: "+ rev);
			
		} catch(Exception e) {
			
			System.out.println("Please Enter a Valid input");
		}
		
		if(s.equalsIgnoreCase(rev)) {
			
			System.out.println(s+ " is Palindrome");
			
		} else {
			
			System.out.println(s+ " is not Palindrome");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		Demo d = new Demo();
		
		Scanner sc = new Scanner(System.in);
		
		int ch;
		
		System.out.println("Please Enter your name: ");
		
		String name = sc.nextLine();
		
		Thread.sleep(1000);
		
		System.out.println("Hi "+ name + ", Nice to see you!");
		
		x:do {
			Thread.sleep(1000);
			
			System.out.println("\nEnter your Choice: \nPress 1 to Reverse the String \nPress 2 to check whether given String is Palindrome");
			
			ch = sc.nextInt();
			
			switch(ch) {
			
			case 1:
					d.reverse();
					break;
			case 2:
					d.findPalindrome();
					break;
			default:
					System.out.println("Invalid input!");
			}
			Thread.sleep(1000);
			
			System.out.println("\nDo you want to continue? (yes/no)");
			
			String ans = sc.next();
			
			if(ans.equalsIgnoreCase("no") || ans.equalsIgnoreCase("n")) {
				
				break x;
			}
			
		} while(ch != 0);	
		
		Thread.sleep(1000);
		
		System.out.println("Hey "+ name + ", Bye. Have a Nice Day!");
	}
}
