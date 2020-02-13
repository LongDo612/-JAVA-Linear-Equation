import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        float a,b,c;
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scanner.nextFloat();
        System.out.println("Enter b: ");
        b = scanner.nextFloat();

        if (a!=0){
            System.out.println("Answer is: "+(-b/a));
        }
        else
            if (b==0){
                System.out.println("Infinite Answers!");
            }
            else
                System.out.println("No solution");
    }
}
