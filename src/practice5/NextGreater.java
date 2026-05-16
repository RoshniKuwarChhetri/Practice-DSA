package practice5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreater {
	public static void main(String[] args) {
		int arr1 []={1,-8,3};
		System.out.println(p(arr1));
	}

	static ArrayList<Integer> p(int arr[]){
		Stack<Integer> stack =new Stack<>();
		ArrayList<Integer> list= new ArrayList<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
		while(!stack.isEmpty() && stack.peek()<=arr[i]) {
			stack.pop();
		}
		if(stack.isEmpty()) {
			list.add(-1);
		}
		
		else {
			list.add(stack.peek());
		}
		stack.push(arr[i]);
		}
		Collections.reverse(list);
		return list;
	}
}
