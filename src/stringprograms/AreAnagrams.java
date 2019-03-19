package stringprograms;

import java.util.Arrays;

public class AreAnagrams {
	
	public static Boolean areAnagram(String input, String input1) 
	{ 
	   
		char[] str1 = input.toCharArray();
		char[] str2 = input1.toCharArray();
		int n1 = str1.length; 
        int n2 = str2.length; 
  
        if (n1 != n2) 
            return false; 
   
        Arrays.sort(str1); 
        Arrays.sort(str2); 
   
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "test"; 
	    String str2 = "ttew"; 
	    if (areAnagram(str1, str2)) 
	        System.out.println("The two strings are anagram of each other"); 
	    else
	    	System.out.println("The two strings are NOT anagram of each other");
	}

}
