class Person{

	String name;
	Pet pet;
	String gender;
	String sound;

	
	Person(String aName){
		name = aName;
	}

	void setPet(Pet anyPet){
		this.pet = anyPet;
		this.gender = anyPet.gender;
		this.sound = anyPet.sound;
	}

	public String toString(){
		String printString = "{" +"\n" + "\t" + "Owner: " + name +"\n" + "\t" +"Pet: " + pet + "\n" + "\t" + "Pet Gender: " + gender + "\n" + "\t" + "Sound: " + sound + "\n" + "}";
		return printString;
	}
}