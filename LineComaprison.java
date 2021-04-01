import java.lang.Math;
public class LineComaprison
{
	
	public static void main(String[] args)
	{

		int x1=2;
		int x2=3;
		int y1=2;
		int y2=4;

		int x3=2;
		int x4=5;
		int y3=2;
		int y4=4;

		double LengthOfLine1 = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println("Length of line 1 is: " +LengthOfLine1);

		double LengthOfLine2 = Math.sqrt((x4-x3)^2 + (y4-y3)^2);
		System.out.println("Length of line 2 is: " +LengthOfLine2);

		Double obj1 = new Double(LengthOfLine1);
		Double obj2 = new Double(LengthOfLine2);

		if(obj1.equals(obj2))
			System.out.println("Both lines are equals");
		else
			System.out.println("Both line are different");

	}
}

