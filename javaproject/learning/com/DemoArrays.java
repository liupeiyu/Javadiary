//DemoArrays.java
import java.util.Collection;
import java.util.ArrayList;
import  java.util.List;
import  java.util.Iterator;
public class DemoArrays{
	//

	public static void main(String[] args){
		
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		DemoArrays demo = new DemoArrays();
		demo.toArray(list);
		demo.toIterator(list);
		demo.toList(list);
		demo.toIndexMethod(list);
		}

	public void toArray(ArrayList arr){
		Object[] obj = arr.toArray();
		for (int i=0;i<obj.length;i++){
			System.out.println(obj[i]);
		}

	}
	public void toIterator(ArrayList arr){
		Iterator it = arr.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}
	public void toList(ArrayList arr){

	for (Object obj:arr){
		System.out.println(obj);
		}

	}

	public void toIndexMethod(ArrayList arr){
		for(int i=0;i<arr.size();i++){

			Object obj=	arr.get(i);
			System.out.println(obj);
		}

	}

	}
