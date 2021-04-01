import java.lang.Math;
public class LineComaprison
{
		public static void main(String[] args)
	{

		int x1=2;
		int x2=3;
		int y1=2;
		int y2=4;

		double LengthOfLine = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
		System.out.println("Length of line is: " +LengthOfLine);
	}
}

