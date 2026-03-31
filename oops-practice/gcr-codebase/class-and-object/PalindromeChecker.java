package oopsPractice;
//Class definition
public class PalindromeChecker {

	//Attributes
	private String text;
	
	//constructor
	public PalindromeChecker(String text) {
		this.text=text;
	}
	
	//Method to check palindrome
	public boolean palindromeCheck() {
		String str=text.replaceAll(" ", "").toLowerCase();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
		
	}
	
	//Method to display
	public void display() {
		boolean result=palindromeCheck();
		if(result) {
			System.out.println(this.text+" Is Palindrome");
			
		}else {
			System.out.println(this.text+" Is Not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		
		PalindromeChecker stringOne=new PalindromeChecker("A man a plan a canal panama");
		PalindromeChecker stringTwo=new PalindromeChecker("Hello");
		stringOne.display();
		stringTwo.display();
	}

}
