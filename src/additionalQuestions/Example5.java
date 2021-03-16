import java.util.*;
class Example5{
	public static void main(String args[]){
	Example5 project = new Example5();
	boolean checked = project.check("Hell*olleh");
	System.out.println(checked);
	}
	public boolean check(String string){
	if(!string.contains("*")){return false;}
	else{
	String arr[]=string.split("\\*");
	char charBefore = arr[0].charAt(arr[0].length()-1);
	char charAfter = arr[1].charAt(0);
	if(charBefore == charAfter){
	return true;
	}
	else{return false;}
	}
	}
}