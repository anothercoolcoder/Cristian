import java.util.Scanner;

public class ejercicios{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.println("Enter a whole number: ");

        int x = sc.nextInt();
        int contador = 0;
        for (int i = 2; i <= x - 1; i++) {
            if (x % i ==0){
                contador++;
            }
        }

        int[] arreglo = new int[contador];

        System.out.println("The value entered is: " + x);
        if (x%2==0){
            System.out.println("The number entered is even ");
        } else {
            System.out.println("The number entered is not even ");
        }

        int p=0;
        for (int i = 2; i <= (x/2); i++) {
            if (x % i == 0){
            p=p+1;
            }
        }
        if (p == 0){
            System.out.println(x + " It's a prime number");
            for (int i = 1; i < 10; i++) {
                System.out.println(x*i);
            }
        }
        else {
            int index = 0;
            System.out.println (x + " It's not a prime number");
            for (int i = 2; i <= x - 1; i++) {
                if (x % i ==0){
                    arreglo[index] = i;
                    index++;
                }
            }
            System.out.println("The divisors of " + x + " are: " );
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i]+ " ");
            }
        }
     
    }
    }
}
