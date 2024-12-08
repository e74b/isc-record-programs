import java.util.*;

class Deviation {
    String name[];
    int totalMarks[];
    int avg, n;
    
    Deviation (int nn) {
        totalMarks = new int[nn];
        name = new String[nn];
        
        n = nn;
    }
    
    void read() {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < n; i++) {
            System.out.println("Student #" + (i + 1));
            System.out.println("Enter name: ");
            name[i] = input.next();
            
            System.out.println("Enter marks: ");
            totalMarks[i] = input.nextInt();
        }
    }
    
    void avg () {
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += totalMarks[i];
        }
        
        avg = (sum / n);
        System.out.println("Average mark: " + avg);
    }
    
    void dev () {
        System.out.println("Name\t\tDeviation\tTotal");
        for (int i = 0; i < n; i++) {
            int deviation = totalMarks[i] - avg;
            
            System.out.println(name[i] + "\t\t" + deviation + "\t\t" + totalMarks[i]);
        }
    }
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        Deviation deviation = new Deviation(input.nextInt());
        deviation.read();
        deviation.avg();
        deviation.dev();
    }
}