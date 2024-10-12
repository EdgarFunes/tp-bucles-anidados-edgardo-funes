import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int opcion;

        do {
            String input = JOptionPane.showInputDialog("Elija un ejercicio:\n1. Números perfectos entre 1 y 1000\n2. Factorial de números hasta N\n3. Suma de factoriales hasta N\n4. Secuencia de letras\n5. Contador de 5 dígitos\n6. Números primos hasta N\n0. Salir");
            opcion = Integer.parseInt(input);

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                case 6:
                    ejercicio6();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opcion != 0);
    }
    //--------------Ejercicios-----------------
    public static void ejercicio1() {
        for (int i = 1; i <= 1000; i++) {
            if (esNumeroPerfecto(i)) {
                System.out.println(i);
            }
        }
    }
    public static void ejercicio2() {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número N:"));
        for (int i = 0; i <= N; i++) {
            System.out.println(factorial(i));
        }
    }
    public static void ejercicio3() {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número N:"));
        long suma = 0;
        for (int i = 0; i <= N; i++) {
            suma += factorial(i);
        }
        System.out.println("Suma de factoriales: " + suma);
    }
    public static void ejercicio4() {

        for (char letra = 'Z'; letra >= 'A'; letra--) {
            for (char i = letra; i >= 'A'; i--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void ejercicio5() {

        for (int i = 0; i < 100000; i++) {
            String numero = String.format("%05d", i).replace('3', 'E');
            System.out.println(numero);
        }
    }
    public static void ejercicio6() {

        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número N:"));
        for (int i = 2; i <= N; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    //--------------Funciones---------------
    public static boolean esNumeroPerfecto(int num) {

        int suma = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                suma += i;
            }
        }
        return suma == num;
    }
    public static long factorial(int num) {

        long resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static boolean esPrimo(int num) {

        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}