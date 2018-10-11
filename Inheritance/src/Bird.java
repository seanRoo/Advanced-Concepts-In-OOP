//TO DO: Make this class abstract
abstract class Bird
{
	String name;		//note all subclasses can inherit 
	String type;		// these
	boolean sings;
	
	Bird()
	{
		System.out.println("JVM making a Bird()");
		//by default all inheriting Birds will sing
		sings = true; 	//set boolean to true
	}

	abstract void sing();
	
	boolean sings()
	{
		return sings;
	}
	public boolean flys()
	{
		return true;
	}

	
}