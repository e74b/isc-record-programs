import java.util.*;

public class Pattern {
	public static void main(String args[]) {
		int i, j, k, l, space = 3;
		for(i=1;i<=4;i++) {
            		for(j=1;j<=space;j++)
                		System.out.print(" ");
                	for(k=1;k<=i;k++)
                    		System.out.print(k);
                        for(l=i-1;l>=1;l--)
                            System.out.print(l);
                		System.out.println();
                	space--;
		}
		space=1;
        	
		for(i=3;i>=1;i--) {
            		for(j=1;j<=space;j++)
                		System.out.print(" ");
                	for(k=1;k<=i;k++)
                    		System.out.print(k);
                        for(l=i-1;l>=1;l--)
                            System.out.print(l);
                	System.out.println();
                	space++;
        	}
	}
}
