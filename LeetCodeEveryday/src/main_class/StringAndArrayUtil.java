package main_class;

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
	
}
