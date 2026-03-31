package dsa;

import java.util.Stack;
//Create QueueUsingStack class to implements queue using stack
public class QueueUsingStack {

	private Stack<Integer> stack1=new Stack<>();
	private Stack<Integer> stack2=new Stack<>();
	
	//Enqueue method
	public void enqueue(int data) {
		stack1.push(data);
	}
	
	//Dequeue method
	public int dequeue() {
		
		if(stack1.isEmpty()&&stack2.isEmpty()) {
			System.out.println("Queue is Empty ");
			return -1;
		}
		
		if(stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
		
		return stack2.pop();
	}
	
	
	public static void main(String[] args) {
	
		QueueUsingStack queue=new QueueUsingStack();
		
		queue.enqueue(2);
		queue.enqueue(4);
		queue.enqueue(6);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
