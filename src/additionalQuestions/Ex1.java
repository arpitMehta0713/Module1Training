import java.util.*;

class Ex1{
public static void main(String args[]){
Ex1 project = new Ex1();
String arr[]={"goa","kerala","gujarat"};
project.toMap(arr);
}
public void toMap(String arr[]){
Map<String, String> map = new HashMap<>();
for(int i=0;i<arr.length;i++){
String key=arr[i].substring(0,3).toUpperCase();
map.put(key,arr[i]);
}
System.out.println(map);
}
}