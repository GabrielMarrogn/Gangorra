import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int p1 = sc.nextInt();
        int c1 = sc.nextInt();
        int p2 = sc.nextInt();
        int c2 = sc.nextInt();

        int lado1 = p1 *c1;
        int lado2 = p2 *c2;

        if(lado1 == lado2){
            System.out.println(0);
        }else if(lado1 < lado2){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }

        sc.close();

    }
}
