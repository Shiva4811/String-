import java.util.Scanner;
public class StringNumbersSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number as a String: ");
        String a=sc.nextLine();
        System.out.println("Enter the second number as a String: ");
        String b=sc.nextLine();
        int num1=0;
        int num2=0;
        for(int i=0; i<a.length(); i++){
            char ch=a.charAt(i);
            int x=(int)ch-48;
            num1=num1*10+x;
        }
        for(int j=0; j<b.length(); j++){
            char ch1=b.charAt(j);
            int y=(int)ch1-48;
            num2=num2*10+y;
        }
        int sum=num1+num2;
        System.out.println("The sum of two number String is: "+sum);
    }
}
