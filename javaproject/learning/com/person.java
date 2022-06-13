//Person.java

public class Person{

	private String name;
	private int age;

	public Person(String name,int age){
		this.name =name;
		this.age = age;

	}

	@Override

	public String toString(){

		return "Person[name="+this.name+",age="+this.age+"]";
	}
	public static void main(String[] args) {
		
		Person person = new Person("zhangliang",34);
		System.out.println(person.toString());

	}
}

