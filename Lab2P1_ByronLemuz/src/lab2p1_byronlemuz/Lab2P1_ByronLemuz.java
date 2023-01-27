/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_byronlemuz;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class Lab2P1_ByronLemuz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 {
        Scanner scanner = new Scanner(System.in);
        
        // Menú de opciones
        while (true) {
            System.out.println("Selecciona una opción:");
            System.out.println("1. Ejercicio 1 - Número Perfecto");
            System.out.println("2. Ejercicio 2 - Sumatoria");
            System.out.println("3. Ejercicio 3 - Serie");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            
            // Ejecuta la opción seleccionada
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
                    System.out.println("Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Intenta de nuevo.");
                    break;
            }
        }
 }}
    public static void ejercicio1() {
        {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        boolean esPrimo = true;

        System.out.print("Ingrese n: ");
        n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.println("Es un numero primo. No se puede realizar el calculo");
        } else if (sum == n) {
            System.out.println("Es un numero perfecto.");
            System.out.print("Divisores: 1 ");
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("No es un numero perfecto.");
        }

    }

    
}
     public static void ejercicio2() {
         Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa un numero entero positivo K: ");
        int k = leer.nextInt();
        double sumatoria = 0;
        int n = 1;
        while (n <= k) {
            sumatoria += (2*n - 1)/(n*(n+1));
            n++;
        }
        System.out.println("La sumatoria es: " + sumatoria);
    }

    
    
     public static void ejercicio3() {
        Scanner lea = new Scanner(System.in);
        System.out.print("Ingrese N: ");
        int N = lea.nextInt();
        System.out.print("Ingrese X: ");
        int X = lea.nextInt();
        
        int num = 0;
        int sign = 1;
        
        System.out.print(num + " ");
        num++;
        System.out.print(num + " ");
        
        while(X > 0) {
            num = num + (N * sign);
            System.out.print(num + " ");
            N++;
            sign = sign * -1;
            X--;
        }
    }
}





    



    