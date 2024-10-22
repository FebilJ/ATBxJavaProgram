package oct.TaskEx.Task_22102024;
//Palidrome of String (chatAt())

import java.util.Scanner;
public class Task_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter String");
        String str=sc.next().toLowerCase();
        String rev="";
        for (int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){

            System.out.println("palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }
		
}
