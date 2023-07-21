package CheckPalindrome;
import java.util.*;
public class Palindrome
{
    static int checkPalindrome(String s){
        if (s.length()==0||s.length()==1){
            return 1;
        }
        if(s.charAt(0)==s.charAt(s.length()-1)){
            return checkPalindrome(s.substring(1,s.length()-1));
        }else{
            return 0;
        }
        }
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner n = new Scanner (System.in);
		String s = n.next();
		int A = checkPalindrome(s);
		System.out.println(A);
	}
}