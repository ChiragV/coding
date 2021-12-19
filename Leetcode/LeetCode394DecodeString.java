package leetcode;

import java.util.Stack;

public class LeetCode394DecodeString {

	public static void main(String[] args) {
		decodeString("3[a2[c]]");// "accaccacc"

	}
	// push digit to int stack
	//push char to char stack 
	// push [ to char stack
	//when closing tag found pop int n and pop char pop char till [( remove it too) and reverser string
	///and keep adding str till n times, user repeat function in String (Java11)
	//is int stack empty ? go with next else add string chars back to stack
	
	 public static String decodeString(String s) 
	 {
		 Stack<Integer> freqStack = new Stack<>();
	        Stack<StringBuilder> strStack = new Stack<>();

	        StringBuilder currStr = new StringBuilder();
	        int k =0;
	        for(char c :  s.toCharArray())
	        {
	            if(Character.isDigit(c))
	            {
	                k = k*10 + Character.getNumericValue(c);
	            } 
	            else if (Character.isLetter(c))
	            {
	                currStr.append(c);
	            } 
	            else if(c == '[')
	            {
	                freqStack.push(k);
	                strStack.push(currStr);
	                k =0;
	                currStr = new StringBuilder();
	            } 
	            else if(c == ']')
	            {
	                StringBuilder temp = currStr;
	                int freq = freqStack.pop();
	                currStr = strStack.pop();
	                while(freq-->0)
	                {
	                    currStr.append(temp);

	                }
	                k = 0;
	            }
	        }
	        return currStr.toString();
	  }

}
