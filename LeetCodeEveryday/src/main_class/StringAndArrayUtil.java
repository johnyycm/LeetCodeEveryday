package main_class;

import java.util.Stack;

/**
 * @author chenmin
 * 
 *
 */
public class StringAndArrayUtil {
	
	/**
	 * Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
	 * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
	 * For example,Given s = "the sky is blue", return "blue is sky the".
	 */
	public static void reverseWords(char[] arr){
		int j = 0;
		for (int i = 0; i < arr.length;i++){   // reverse each word in string, except last one
			if (arr[i]==' '){
				reverseString(arr, j , i-1);
				j = i+1;
				}
		}
		reverseString(arr, j, arr.length-1);    // reverse last word
		reverseString(arr, 0 , arr.length-1);	//reverse whole string
		
	}
	
	public static void reverseString(char[] arr, int i , int j){
		while (i<j){
			char temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	
	/**
	 * Rotate an array of n elements to the right by k steps.
	 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. 
	 */
	public static void rotate(int[]nums, int k){
		if (nums==null || nums.length==0 || k<0)
			throw new IllegalArgumentException("Illegal arguments");
		int length = nums.length;
		k = k % length;
		reverse(nums,0,length-k-1);							//reverse first part
		reverse(nums,length-k, length-1);					//reverse second part
		reverse(nums, 0 , length-1);						//reverse whole array
		
	}
	public static void reverse(int[] nums, int i , int j){
		while (i<j){
			int temp = nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
			i++;
			j--;
		}
	}
	
	
	/**
	 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
	 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
	 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
  	 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
	 * @return
	 */
	public static int evalRPN(String[] array ){
		int result=0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<>();
		for (String s : array){
			if (operators.contains(s)){
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(s);
				switch(index){
				case 0:
					stack.push(String.valueOf(a+b));
					break;
				case 1:
					stack.push(String.valueOf(a-b));
					break;
				case 2:
					stack.push(String.valueOf(a*b));
					break;
				case 3:
					String temp = String.valueOf(b/a);
					stack.push(temp);
					break;
				}
			}else{
				stack.push(s);
			}
		}
		result = Integer.valueOf(stack.pop());
		return result;
	}
	
}
