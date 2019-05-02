package stack;

import com.app.core.Emp;

public class FixedStack implements Stack{
	//state
	private int top;
	private Emp[] emps;
	public FixedStack() {
		top=-1;
		emps=new Emp[STACK_SIZE];
	}

	@Override
	public void push(Emp e) {
		if(top < STACK_SIZE-1)
		 emps[++top]=e;
		else 
			System.out.println("Stack overflow.....");
		
	}

	@Override
	public Emp pop() {
		if(top == -1) {
			System.out.println("Stack undeflow!!!!!");
			return null;
		}
		return emps[top--];
	}

}
