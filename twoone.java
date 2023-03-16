import java.util.Scanner;
import java.lang.Math;

public class twoone
{
    public static void main(String args[])
    {
        Scanner reader=new Scanner(System.in);
        double amount=reader.nextDouble();
        double year = reader.nextDouble();
        double monthlypayment=0;
        double totalpayment=0;
        System.out.println("interest rate   monthly payment    total payment");
        for(double rate=0.05;rate<=0.08;rate+=0.00125)
        {
            monthlypayment=(amount*rate/12)/(1-1/(Math.pow(1+rate/12,year*12)));
            totalpayment=monthlypayment*year*12;
            System.out.println(rate*100+"%   "+monthlypayment+"    "+totalpayment);
        }
    }
}
// import java.util.Scanner;
// import java.lang.Math;
// public class twoone {
// 	public static void main(String args[]) {
// 		Scanner reader=new Scanner(System.in);
//         System.out.println("用户借贷总金额");
// 		int amount=reader.nextInt();
//         System.out.println("用户借贷年限");
// 		double year=reader.nextDouble();
// 		double monthlypayment=0;
// 		double totalpayment=0;
// 		System.out.println("interest rate   monthly payment   total payment"); 
// 		for(double rate=0.05;rate<=0.08;rate+=0.00125)
// 		{
// 			monthlypayment=(amount*rate/12)/(1-1/(Math.pow(1+rate/12,year*12)));
// 			totalpayment=monthlypayment*year*12;
// 			System.out.println(rate*100+"%    "+monthlypayment+"    "+totalpayment); 
// 		}
// 	}
// }

