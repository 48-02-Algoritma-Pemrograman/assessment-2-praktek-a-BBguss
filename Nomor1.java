import java.util.Scanner;

public class Nomor1 {
     public static void bilN(int N) {
        int i;
        int j=0;
        for (i=0; i <= N; i++) {
            if (i ==3 && i != 0) {
                j = 3 * i;
                System.out.println("fizz");
            }
            System.out.println(i);

        }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        bilN(N);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor1.class.getDeclaredMethods().length); 
    }
    
}
