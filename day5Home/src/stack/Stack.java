package stack;

import com.app.core.Emp;

public interface Stack {
	int STACK_SIZE=3;
	void push(Emp e);
	Emp pop();
}
