import java.util.Scanner;

public class problem1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        //Taking input for no. of rows
        int n = sc.nextInt();
        int ans = 0;
        while (n != 0)
        {
            ans++;
            n = n / 10;
        }
        System.out.println(ans);
    }


}
