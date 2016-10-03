package main_class;

import java.util.Arrays;

public class LeetCodeEveryday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test for reverse words in String";
		char[] arr = s.toCharArray();
		StringAndArrayUtil.reverseWords(arr);
		System.out.println(arr);
		int [] nums = {1,2,3,4,5,6,7,8,9,10};
		StringAndArrayUtil.rotate(nums, 4);
		System.out.println(Arrays.toString(nums));
		
		String[] test = {"4", "13", "5", "/", "+"};
		System.out.println(StringAndArrayUtil.evalRPN(test));
	}

}
