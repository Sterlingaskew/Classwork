package distance;

public class Distance {
	private int xOne, yOne, xTwo, yTwo;
	private double distance;

	public Distance()
	{
		
	}

	public Distance(int x1, int y1, int x2, int y2) 
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
		
	}

	public void setCoordinates(int x1, int y1, int x2, int y2) 
	{
		xOne=x1;
		yOne=y1;
		xTwo=x2;
		yTwo=y2;
	}

	public void calcDistance() 
	{
		distance = Math.sqrt(Math.pow(xTwo-xOne, 2)+Math.pow(yTwo-yOne, 2));
		
	}

	public double getDistance() 
	{
		return distance;
	}

	public String toString() {
		return "distance == "+String.format("%.3f",distance);
	}

}
