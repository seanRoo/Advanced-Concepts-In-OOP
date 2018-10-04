class Dog extends Pet{
	//String name;
	Bone bone;
	String sound = "woof";

	Dog(String name, String gender){
		super(name, gender, "woof");
		bone = new Bone();
	}
	
	public String toString(){
		String printString = name + " " + bone;
		return printString;
	}
}