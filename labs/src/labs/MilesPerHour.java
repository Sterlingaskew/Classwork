package labs;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;
		
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance=dist;
		hours=hrs;
		minutes=mins;
	}

	public void calcMPH()
	{
		mph=(distance/(hours+((double)minutes/60)));
		
	}

	public String toString()
	{
		return distance+ " miles in "+hours+" hour and "+minutes+" minutes = "+ Math.round(mph)+" MPH\n";
	}
	/*public void print()
	{
		System.out.print(distance+" miles in "+hours+" hour and "+minutes+" minutes = "+ Math.round(mph)+" MPH\n");
	*/}

