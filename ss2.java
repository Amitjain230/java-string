import java.util.Scanner;
class ss2{
	public static void main(String args[]){

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any string:");
	String s=sc.nextLine();
	if(s.length()<5){
	System.out.println("Too Short");
}
	char ch[]=s.toCharArray();
	for(int i=0;i<ch.length;i++){
	if(ch[i]>'a' && ch[i]<'z' || ch[i]<0||ch[i]>31){


}

	else{
	System.out.println("Special Character");
}
}
}
}


