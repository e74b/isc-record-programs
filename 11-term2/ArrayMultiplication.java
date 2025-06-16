import java.util.*;

class ArrayMultiplication {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter array length: ");
        int length = input.nextInt();
        int array1[] = new int[length];
        int array2[] = new int[length];
        int product[] = new int[length];
        System.out.println("Enter array 1 elements (" + length + "): ");
        for (int i  = 0; i < length; i++)
            array1[i] = input.nextInt();
            
        System.out.println("Enter array 2 elements (" + length + "): ");
        for (int i  = 0; i < length; i++)
            array2[i] = input.nextInt();
        
        System.out.println("Array Product: ");
        for (int i  = 0; i < length; i++) {
            product[i] = array1[i] * array2[i];
            System.out.println(product[i]);
        }
    }
}