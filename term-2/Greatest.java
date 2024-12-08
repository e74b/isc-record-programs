import java.util.*;

class Greatest {
    int num1, num2;
    
    Greatest (int nn, int mm) {
        num1 = nn;
        num2 = mm;
    }
    
    int GCD (int a, int b) {
        int remainder = a % b;
        
        if (remainder == 0) {
            return b;
        } else {
            return GCD(b, remainder);
        }
    }
    
    void print() {
        int gcd = GCD(num1, num2);
        
        System.out.println("HCF(" + num1 + ", " + num2 + ") = " + gcd);
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        Greatest gcd = new Greatest(a, b);
        gcd.print();
    }
}