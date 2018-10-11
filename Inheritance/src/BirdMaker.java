/*
*	This is a main class, which intends to create an array of type
*	Bird {abstract}, and populate it randomly with the concrete types:
*		BlackBird or Emu
*	after which, a call to sing() is made. Depending on the concrete
*	object type, a differing sing() implementation should execute.
*/
import java.util.Random;
class BirdMaker
{


	public static void main(String[] args)
	{
		int randNum;
		Bird[] birds = new Bird[6];	//new empty Bird[]
		
		for( int i = 0; i < birds.length; i++){  
		{
			//Add Code to fill birds[i] with either a BlackBird or and Emu
			//...add code here
			Random rand = new Random();

			int  n = rand.nextInt(10) + 1;
			if(n % 2 == 0){
				birds[i] = new BlackBird();
			}
			else if(n % 2 ==1){
				birds[i] = new Emu();
			}

			
			birds[i].sing();
			//a polym___h_c call
			
			}
		}
	}
}

/* After you understand the above example and have gotten it to execute successfully...
	try to replace the two lines marked [*] with just this _one_ equivalent expression:
		birds[i].sing();
	and see that it works the same
*/
