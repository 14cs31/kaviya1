import java.util.Scanner;
class even{
public static void main(String args[]){
int num;
Scanner s=new Scanner(System.in);
System.out.println("enter the number");
num=s.nextInt();
if(num%2==0)
{
System.out.println("Even Number");
}
else
{
System.out.println("Odd Number");
}
}
}
