import java.util.Scanner;
class Addition2{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("addition of two numbers/n enter two numbers");
int num1= scan.nextInt();
int num2= scan.nextInt();
int res = num1+num2;
System.out.print("addition of two numbers"+res);
}
}