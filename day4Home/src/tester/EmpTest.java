package tester;
import com.core.*;
import java.util.Scanner;

public class EmpTest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of Employee:");
		Emp[] e = new Emp[s.nextInt()];
		boolean x=true;
		int i=0;
		while(x==true)
		{
			System.out.printf("\nEnter ur choice:\n1.Hire Manager\t2.Hire Worker\t3.Display Details\n4.Fire Emp\t5.Salary Increment\t6.Exit\n");
			switch(s.nextInt())
			{
				case 1:
					if(i<e.length) 
					{
						System.out.println("Enter Manager Details:(name email basic perfBonus)");
						e[i]=new Mgr(s.next(), s.next(), s.nextDouble(), s.nextDouble());
						System.out.println(e[i]);
						i++;
					}
					else
						System.out.println("Employee Stack Full!!");
					break;
				case 2:
					if(i<e.length) 
					{
						System.out.println("Enter Worker Details:(name email basic HourWorked HourlyRate)");
						e[i]=new Worker(s.next(), s.next(), s.nextDouble(), s.nextInt(),s.nextDouble());
						System.out.println(e[i]);
						i++;
					}
					else
						System.out.println("Employee Stack Full!!");
					break;
				case 3:
					System.out.println("Enter the Employee id:");
					int idSearch=s.nextInt();
					int flag=0;
					for(int j=0;j<e.length;j++)
					{
						if(e[j].getId()==idSearch)
						{
							System.out.println(e[j]);
							flag=0;
							break;
						}
						else 
						{
							flag++;
						}
					}
					if(flag>0)
					{
						System.out.println("Employee Not Found!!");
					}
						break;
				case 4:
					System.out.println("Enter the Employee id:");
					int idkill=s.nextInt();
					int flagNew=0;
					for(int j=0;j<e.length;j++)
					{
						if(e[j].getId()==idkill)
						{
							e[j]=null;
							flagNew=0;
							break;
						}
						else 
						{
							flagNew++;
						}
					}
					if(flagNew>0)
					{
						System.out.println("Employee Not Found!!");
					}
					break;
				case 5:
					System.out.println("Enter the Employee id:");
					int idInc=s.nextInt();
					int flagN=0;
					for(int j=0;j<e.length;j++)
					{
						if(e[j].getId()==idInc)
						{
							System.out.println(e[j]);
							System.out.println("Enter the amt u want to increase:");
							System.out.println("Salary Increment: "+e[j].salInc(s.nextDouble()));
							flagN=0;
							break;
						}
						else 
						{
							flagN++;
						}
					}
					if(flagN>0)
					{
						System.out.println("Employee Not Found!!");
					}
					break;
				case 6:
					x=false;
					break;
				default:
					System.out.println("Invalid Input!!");
			}
		}
		if(s!=null)
			s.close();

	}

}
