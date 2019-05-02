package stack;

import com.app.core.Emp;

public class GrowableStack implements Stack {
	// state
	private int top;
	private Emp[] emps;

	public GrowableStack() {
		top = -1;
		emps = new Emp[STACK_SIZE];
	}

	@Override
	public void push(Emp e) {
		if (top < emps.length - 1)
			emps[++top] = e;
		else {
			// create a new array of double the size
			Emp[] tmp = new Emp[emps.length * 2];

			// fill it with emp refs.
			for (int i = 0; i < emps.length; i++)
				tmp[i] = emps[i];
			// re-assgn the ref
			emps = tmp;
			//store data
			emps[++top] = e;

		}

	}

	@Override
	public Emp pop() {
		if (top == -1) {
			System.out.println("Stack undeflow!!!!!");
			return null;
		}
		return emps[top--];
	}

}
