//DemoCollection.java
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.LinkedList;
public class DemoCollection{

	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add("aaa");
		linkedlist.add("bbb");
		linkedlist.addFirst("ccc");
		linkedlist.addLast("ddd");
		System.out.println(linkedlist);
		System.out.println(linkedlist.getFirst());
		System.out.println(linkedlist.getLast());
		Object obj =linkedlist.removeFirst();
		System.out.println(obj);
		System.out.println(linkedlist);

	}


}

class Student{

	private String name;
	private int age;

	public Student(String name,int age){

		this.name = name;
		this.age = age;
	}

	public void setName(String name){

		this.name=name;
	}
	public void setAge(int age){

		this.age=age;
	}
	public String getName(){
		return name;
	}
	public int  getAge(){
		return age;
	}

}