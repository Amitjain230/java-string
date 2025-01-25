import java.util.Scanner;
class ss11{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string");
	String s=sc.nextLine();
	char ch[]=s.toCharArray();
	System.out.println("Enter index");
	int index=sc.nextInt();	
	System.out.println("Enter character");
	char c=sc.next().charAt(0);	

	int j;
	for(j=0;j<index;j++){
}
	if(index>ch.length){
	System.out.println("String length is short");
}
	else{
	String x=s.replace(ch[j],c);
	System.out.println("After replace:"+x);
}
}
}