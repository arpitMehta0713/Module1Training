import java.util.*;

class Ex2{
public static void main(String args[]){
Ex2 project = new Ex2();
Map<String, String> map = new LinkedHashMap<>();
	map.put("ram", "hari");
	map.put("cisco", "barfi");
	map.put("honeywell", "cs");
	map.put("cts", "hari");
String arr[]=project.findKey(map,"hari");
for(int i =0 ;i< arr.length;i++){
System.out.println(arr[i]);
}
}
public String[] findKey(Map<String,String> map, String toFind){
Set<String> keys = map.keySet();
List<String> keyList = new ArrayList<>();
for(String key : keys){
String value = map.get(key);
if(value.equals(toFind)){
keyList.add(key);
}
}
String updatedKeysList[]=keyList.toArray(new String[0]);
return updatedKeysList;
}
}