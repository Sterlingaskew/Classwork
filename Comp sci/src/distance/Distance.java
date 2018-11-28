package distance;


public class Distance
{
	private int x1,y1,x2,y2;

	public Distance()
	{
		setCoordinates(0,0,0,0);
	}

	public Distance(int xOne, int yOne, int xTwo, int yTwo)
	{
		setCoordinates(xOne,yOne,xTwo,yTwo);

	}

	public void setCoordinates(int xOne, int yOne, int xTwo, int yTwo)
	{
		x1=xOne;
		y1=yOne;
		x2=xTwo;
		y2=yTwo;

	}

	public String determineClosest( )
	{
		double distanceA = 0.0, distanceB = 0.0;
		//String result="";
		distanceA=Math.sqrt(Math.pow(x1, 2)+Math.pow(y1, 2));
		distanceB=Math.sqrt(Math.pow(x2, 2)+Math.pow(y2, 2));
		if (distanceA<distanceB) 
			return"A is closer to (0,0).";
			return"B is closer to (0,0).";
	
	}
	
	public String toString()
	{
		return "";
	}
}
