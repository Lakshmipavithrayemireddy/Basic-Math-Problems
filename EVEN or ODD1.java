import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number to check even or odd: ");
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is Even");
        }
        else
        {
            System.out.println(n+" is Odd");
        }
    }
}
