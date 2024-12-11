import java.util.Scanner;
class S33{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s="  Hello  World  ";
	System.out.println("Length of string before trim"+s.length());
	String s1=s.trim();
	System.out.println("Length of string after trim"+s1.length());

}
}