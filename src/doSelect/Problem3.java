package doSelect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ArrayListOps {
	public ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> list = new ArrayList<>(n);
		for(int i=0;i<n;i++){
			list.add(0);
		}
		return list;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list){
		Collections.reverse(list);
		return list;
	}
	public ArrayList<Integer> changeList(ArrayList<Integer> list, int m, int n){
		Collections.replaceAll(list, m, n);
		System.out.println(list);
		return list;
	}
}
public class Problem3 {
	public static void main(String[] args) {
		ArrayListOps ops=new ArrayListOps();
		ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10,25,33,28,10,12));
		ops.makeArrayListInt(4);
		ops.reverseList(list);
		ops.changeList(list, 28, 20);
	}
}