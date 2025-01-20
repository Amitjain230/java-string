import java.util.Scanner;
class JavaClass24{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("Input a number : ");
        int a=sc.nextInt();
        if (a>1000000)
        {
            System.out.println("Input value : "+a);
            System.out.println("Large ");
        }
        else if(a==0)
        {
            System.out.println("Input value : "+a);
            System.out.println("Small");
        }
        else if(a>0)
        {
            System.out.println("Input value : "+a);
            System.out.print("Positive number");
        }
        else if(a<0)
        {
            System.out.println("Input value : "+a);
            System.out.print("Negative number");
        }
    }
}	
