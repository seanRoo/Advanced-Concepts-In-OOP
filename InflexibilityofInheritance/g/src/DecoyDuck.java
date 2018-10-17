
class DecoyDuck extends Duck {
	
	DecoyDuck(){
		quackBehavior = new NoWayQuack();
		flyBehavior   = new NoWayFly();
	}
	
	void display() {
		System.out.println("DecoyDuck.display()");
	}
		
}
