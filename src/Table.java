import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,i;
        num1 = sc.nextInt();
        for(i=0;i<10;i++){
            System.out.println(num1 + "x" + (i+1) + "=" + (num1 * (i+1)));
        }
    }
}
