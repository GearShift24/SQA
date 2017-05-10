package sqa.controller;
import java.util.PriorityQueue;
import sqa.model.*;

public class SQAController 
{

	private PriorityQueue<Customer> myCustomers;
	
	
	
	
	public void start()
	{

		
		changePriorityQueue();
		
	}
	
	public SQAController()
	{
		
		myCustomers = new PriorityQueue<Customer>();
		
	}
	
	
	
	public void changePriorityQueue()
	{
		myCustomers.add(new Customer(1));

		myCustomers.remove(1);
		
		
		myCustomers.clear();
	}

	
}
