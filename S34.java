import java.util.Scanner;
class S34{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s="Welcome to bhopal";
	String arr[]=s.split(" ");
	String r=String.join(":",arr);
	System.out.println(r);

}
}