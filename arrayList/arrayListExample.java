package arrayList;

import java.util.ArrayList;

public class arrayListExample {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		System.out.println("Initial size : " + list.size());
		list.add(10);
		list.add(12);
		list.add(13);
		list.add(14);
		for(int i = 0; i < list.size(); i++)
		System.out.println((i+1) + " : " + list.get(i));
		System.out.println("Final size : " + list.size());

	}

}
