import java.util.Scanner;

public class CalculadoraFactorial {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.print("Introduzca un numero: ");
        int numero = scanner.nextInt();

        if(numero > 0)
        {
            long factorial = 1;
            String symbols = numero == 0 ? "!" : "! = ";
            StringBuilder factores = new StringBuilder(numero + symbols);

            for (int i = numero; i > 0; i--) {
                factorial *= i;
                factores.append(i);
                if (i != 1) {
                    factores.append(" * ");
                }
            }
            factores.append(" = ").append(factorial);
            System.out.println(factores.toString());
        }else
            System.out.println("El numero debe ser positivo");

        scanner.close();
    }
}
