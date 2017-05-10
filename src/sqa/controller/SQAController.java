package sqa.controller;
import java.util.PriorityQueue;
import sqa.model.*;
import java.util.Stack;

public class SQAController 
{
	private Stack<Customer> myStack;
	private PriorityQueue<Customer> myCustomers;
	
	
	
	
	public void start()
	{

		
		changePriorityQueue();
		changeStack();
		
	}
	
	public SQAController()
	{
		
		myCustomers = new PriorityQueue<Customer>();
		myStack = new Stack<Customer>();
		
	}
	
	
	
	public void changePriorityQueue()
	{
		myCustomers.add(new Customer(1));

		myCustomers.remove(1);
		
		
		myCustomers.clear();
	}
	
	public void changeStack()
	{
		myStack.push(new Customer(1));
		myStack.peek();
		myStack.pop();
		
	}

	
}
