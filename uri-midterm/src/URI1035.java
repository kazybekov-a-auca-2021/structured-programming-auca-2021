import java.util.Scanner;

public class URI1035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt(), d = scan.nextInt();
        if(b>a && d>c && c+d>a+b && c>0 && a%2==0) System.out.println("Valores aceitos");
        else System.out.println("Valores no aceitos");
    }
}
