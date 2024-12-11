import java.util.Scanner;
class S32{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter any string : ");
	String s=sc.nextLine();
	char arr[]=s.toCharArray();
	int count=0;
	for(int i=0;i<s.length();i++){
	if(arr[i]<='Z' &&  arr[i]>='A'){
	count++;
}
}
	if(count==s.length()){
	System.out.println("true");
}	
	else{
	System.out.println("False");
}
}
}