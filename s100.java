import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
      if(s.length()<3){
        System.out.println("Short");
      }
      char ch[]=s.toCharArray();
      for(int i=0;i<ch.length;i++){
        if(ch[i]>'a' && ch[i]<'z'){
          
        }
        else{
          System.out.println("special characters or digits Contains");
          break;
        }
      }
  }
}



