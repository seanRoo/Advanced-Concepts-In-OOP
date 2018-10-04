class Cat extends Pet{

	Fish fish;

	Cat(String name, String gender){
		super(name, gender, "meow");
		fish = new Fish();
	}
	
	public String toString(){
		String printString = name + " " + fish;
		return printString;
	}
}