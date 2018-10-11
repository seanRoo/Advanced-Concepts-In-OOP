//TO DO: Make this class abstract
abstract class FlightlessBird extends Bird
{

	FlightlessBird()
	{
	  System.out.println("JVM making FlightlessBird");
	}
	

	public boolean flys()
	{
		return false;
	}
	
	
}