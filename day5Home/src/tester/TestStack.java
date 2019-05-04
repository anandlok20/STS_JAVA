package tester;

import java.util.Scanner;
import com.app.core.Emp;

import stack.FixedStack;
import stack.GrowableStack;
import stack.Stack;

public class TestStack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		// i/f ref
		Stack ref = null;
		while (!exit) {
			System.out.println("Options 1: FS 2 : GS 3 : Push 4 :Pop 5 :Exit");
			switch (sc.nextInt()) {
			
			case 1: // FS
				if (ref == null)
					ref = new FixedStack();
				else
					System.out.println("Stack is alrdy chosen!!!");

				break;
			case 2: // GS
				if (ref == null)
					ref = new GrowableStack();
				else
					System.out.println("Stack is alrdy chosen!!!");

				break;
			case 3: // push
				if (ref != null) {
					System.out.println("Enter emp dtls id name");
					Emp e = new Emp(sc.nextInt(), sc.next());
					ref.push(e);
				} else
					System.out.println("U haven't chosen stack!!!!");
				break;
			case 4: // pop
				if (ref != null) {
						System.out.println(ref.pop());
				} else
					System.out.println("U haven't chosen stack!!!!");
				break;
			case 5:exit=true;
				break;
			}
		}
		if (sc != null)
			sc.close();
	}

}
