//WRITE CODE: - choose to make this Duck implement Flyable or Quackable or both
class MallardDuck extends Duck implements Flyable, Quackable {
 
	void display() {
		System.out.println("MallardDuck shows its feathers");
	}
	public void fly(){//when implementing interfaces, they have to be public
		System.out.println("Wheeesh");
	}
	public void quack(){

	}
}
