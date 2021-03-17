import java.util.*;
class Example16{
	public static void main(String args[]){
	Example16  project = new Example16();
	boolean checker = project.check("madam");
	System.out.println(checker);
	}

	public boolean check(String string){
	StringBuilder builder = new StringBuilder(string);
	String reversed = builder.reverse().toString();
	if(!string.equals(reversed)){return false;}
	int aCount=0,eCount=0,iCount=0,oCount=0,uCount=0;
	for(int i=0;i<reversed.length();i++){
	if(reversed.toLowerCase().charAt(i)=='a'){
	aCount++;
	}
	else if(reversed.toLowerCase().charAt(i)=='e'){
	eCount++;
	}
	else if(reversed.toLowerCase().charAt(i)=='i'){
	iCount++;
	}
	else if(reversed.toLowerCase().charAt(i)=='o'){
	oCount++;
	}
	else if(reversed.toLowerCase().charAt(i)=='u'){
	uCount++;
	}
	}
	Integer arr[] = {aCount,eCount, iCount, oCount, uCount};
	for(int i=0;i<arr.length;i++){
	
	for(int j=i;j<arr.length;j++){
		System.out.println(arr[i]);
		System.out.println(arr[j]);
		if(arr[i]>0 && arr[j]>0){
		return true;
		}
	}
	}
	return false;
	}
}