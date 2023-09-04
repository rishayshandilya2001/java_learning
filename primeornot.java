import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();

        boolean p=true;

    for(int i=2;i<no;i++)
    {
     if(no%i==0)
     { 
        p=false;
        break;

     }
    }

    if(p)
    {
     System.out.println("prime");
     
    }
    else
    {
        System.out.println("not prime");
    }
}
}
