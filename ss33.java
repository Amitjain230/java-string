import java.util.Scanner;
class ss33{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string:");
	String s=sc.nextLine();
	char ch[]=s.tocharAt();
	for(int i=0;i<ch.length;i++){
	if(ch[i]=='e'){
	System.out.println("yes");
}
	else{
	System.out.println("Not");
}
}


}
}