import java.util.Scanner;

public class NumberStarPattern1 {
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n,i,j;
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=n;j>0;j--){
                if(j==i)
                    System.out.print("*");
                else
                    System.out.print(j);
            }
            System.out.println();
        }

	}
}