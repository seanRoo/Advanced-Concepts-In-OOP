/*
 * This example attempts to show the issue with 
 *	trying to solve the problem by using interfaces
 *	instead of inheritance.
 *  
 *  While this solution improves on inheritance in 
 *	a way, it causes a major maintenance issue
 *	which is not desirable.
 */
class Runner
{
	public static void main(String[] args)
	{
		System.out.println("Welcome to the duck show");
		System.out.println("On display today...");
		
		Duck[] ducks = new Duck[]{ 	new MallardDuck()
									, new RedHeadDuck()
									, new RubberDuck()
									, new DecoyDuck()		
									};
		demonstrateDucks(ducks);
	}
	
	
	static void demonstrateDucks(Duck[] duckArray){
		
		for (Duck d : duckArray){
			d.display();			

			System.out.print("\t, then it swims like this: ");
				d.swim();				
			if( d instanceof Quackable)
			{
				System.out.print("\t, and makes a ");
				((Quackable)d).quack();		
			}		
			
			if(d instanceof Flyable )
			{
				System.out.print("\t, and flys off: ");
					((Flyable)d).fly();
			}
			System.out.println("\n\n");
		}
	}
}