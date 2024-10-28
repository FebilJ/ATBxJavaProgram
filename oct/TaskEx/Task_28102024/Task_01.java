package oct.TaskEx.Task_28102024;

import java.util.Scanner;

public class Task_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// String functions
		//String s ="welcome";
		
		String s = new String("welcome");
		System.out.println(s);
		
		//length - returns length of a string(number of characters)
		String s1 ="welcome";
		s1.length();
		System.out.println(s1.length());
		System.out.println("Good Morning".length());
		
		//Concatenation
		String s3 = "welcome2";
		String s4 = "Home";
		System.out.println(s1.concat(s4));
		System.out.println(s1.concat(s3).concat(s4));
		
		 //toUpperCase() function
		
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String str = sc.next();
        
        String StrUpCase = str.toUpperCase();
        System.out.printf("\nString converted to Upper Case: %s",StrUpCase);

        //SCP (String Constant Pool) Allocation
        String str1 = "Doing";
        String str2 = " Good";

        //OA (Object Area) or Heap Area Allocation
        String str3 = new String("Doing");
        String str4 = new String("good");

        //substring() function
        String str5 = str.substring(2,5);
        System.out.printf("\nSubstring: %s", str5);

        //concat() function
        String str6 = str1.concat(str2);
        System.out.printf("\nConcatenated String: %s", str6);

        //trim() function
        String strtrim = str.trim();
        System.out.printf("\nTrimmed String: %s", strtrim);

        //indexOf(), LastIndexOf() functions
        System.out.println("\nIndex of d in Udita: " + str3.indexOf("d"));
        System.out.println("Last Index of entered string: " + str3.lastIndexOf(str));

        //contains() function
        System.out.println("Does the string contains 'har': " + str4.contains("har"));

        //splitting
        String fruits = "Mango Orange Apple";
        String[] fruitsArray = fruits.split(",");
        System.out.println("Fruits: " + fruits);

        //replace() function
        String replacedString = str.replace('a', 'e');
        System.out.println("Replaced String: " + replacedString);

        //replaceAll() function
        String replacedAllString = str.replaceAll("[aeiou]", "*");
        System.out.println("Replaced All String: " + replacedAllString);

        sc.close();
		
		
	}

}