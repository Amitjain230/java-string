import java.util.Scanner;
class ss1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any String");
	String x=sc.nextLine();
	if(x.length()<3){
	System.out.println("IT TOO SHORT");
}
	char ch[]=x.toCharArray();
	for(int i=0;i<ch.length;i++){
	if(ch[i]>'a' &&  ch[i]<'z'){

}

	else {
	System.out.println("Special character");
	break;
}
}

}



}