public class PersonDetails{
   public static void main(String[]args){
	   // using default constructor
     Person person1 = new Person();
	 System.out.println("Person 1:");
     person1.display();
	 
	 // using parameterised constructor
	 Person person2 = new Person("Amar", 15, "Bhopal");
     System.out.println("\nPerson 2:");
     person2.display();
	 
	 //using copy constructor
	 Person person3 = new Person(person2);
	 System.out.println("\nPerson 3(copy of person 2):");
     person3.display();
   }
 }
   class Person{
     //attributes
     String name;
	 int age;
	 String homeTown;
	 
	 //default constructor
	 Person(){
	   name = "Harry";
	   age = 19;
	   homeTown = "Indore" ;
	 }
	 
	 // parameterised constructor
	 Person(String name, int age, String homeTown){
	   this.name = name;
       this.age = age;
       this.homeTown = homeTown;	   
	 }
	 
	 // copy constructor
	 Person(Person original){
	   this.name = original.name;
       this.age = original.age;
       this.homeTown = original.homeTown;	   
	 }
	 
	 //method to display
	 public void display(){
	    System.out.println("Person's name is: " + name);
		System.out.println("Person's age is: " + age);
		System.out.println("Person's hometown is: " + homeTown);
	 }
   }
   