/**
 * 
 */
package main_class;

/**
 * @author chenmin
 *
 */
public class LinkedListUtil {
	public static class Node{
		Node next;
		int val;
		public Node(int x){
			val = x;
			next = null;
		}
	}
	
	public static class Stack{
		Node top;
		
		public Node pop(){
			if (top==null)
				return null;
			else{
				Node temp = new Node(top.val);
				top = top.next;
				return temp;
			}
		}
		
		public Node peek(){
			if(top!=null)
				return top;
			return null;
		}
		
		public void push(Node node){
			if(node != null){
				node.next = top;
				top = node;	
			}
		}
		
	}
	
	public static class Queue{
		Node first, last;
		
		public void enqueue(Node node){
			if (first != null){
				last.next = node;
				last = node;
			}else{
				first = node;
				last = first;
			}
		}
		
		public Node dequeue(){
			if (first == null)
				return null;
			else{
				Node temp = new Node(first.val);
				first = first.next;
				return temp;
			}
		}
	}
}





















