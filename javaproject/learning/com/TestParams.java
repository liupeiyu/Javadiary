

public class OutClass{

	public static void main(String[] args) {
		OutClass outclass = new OutClass();
		outclass.play();
		OutClass.Inner innerobject = outclass.new Inner();
		innerobject.innerfunction();

}


private String name;

public void play(){
	System.out.println("play function");
	System.out.println(name);

}

public class Inner{

	private String innername;

	public void innerfunction(){

		System.out.println("Inner function:"+innername);
	}
	public Inner(){

		this.innername = "内部类中的属性值";

	}

}



}