class Runner{
	
	public static void main(String[] args){

		Person p = new Person("Joe");
		Person p2 = new Person("Fred");
		Pet doggo = new Dog("Paul", "female");
		Pet cat = new Cat("Larry", "female");
		p.setPet(cat);
		p2.setPet(doggo);
		System.out.println(p);
		System.out.println(p2);
	}
}