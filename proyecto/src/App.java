import java.util.InputMismatchException;
import java.util.Scanner;
 
public class App {
 
    public static void main(String[] args) {
 
        Scanner f = new Scanner(System.in);
        boolean Regresar = false;
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
            System.out.println("Menu");
            System.out.println("1. Calculadora");
            System.out.println("2. Funciones Matematicas");
            System.out.println("3. Utilidades");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = f.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Calculadora");
                        while (!Regresar){
                            System.out.println("Menu");
                            System.out.println("1. Suma");
                            System.out.println("2. Resta");
                            System.out.println("3. Multiplicacion");
                            System.out.println("4. Division");
                            System.out.println("5. Regresar");
                            try {
                                System.out.println("Escribe una de las opciones");
                                opcion = f.nextInt();
                                switch (opcion) {
                                    case 1:
                                        System.out.println("Suma");
                                        Suma();
                                        break;
                                    case 2:
                                        System.out.println("Resta");
                                        Resta();
                                        break;
                                    case 3:
                                        System.out.println("Multiplicacion");
                                        Multiplicacion();
                                        break;
                                    case 4:
                                        System.out.println("Division");
                                        Division();
                                        break;
                                    case 5:
                                        Regresar = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 5");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                f.next();
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Funciones Matematicas");
                        while (!Regresar){
                            System.out.println("Menu");
                            System.out.println("1. Factorial");
                            System.out.println("2. Fibonacci");
                            System.out.println("3. Regresar");
                            try {
                                System.out.println("Escribe una de las opciones");
                                opcion = f.nextInt();
                                switch (opcion) {
                                    case 1:
                                        System.out.println("Factorial");
                                        Factorial();
                                        break;
                                    case 2:
                                        System.out.println("Fibonacci");
                                        Fibonacci();
                                        break;
                                    case 3:
                                        Regresar = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                f.next();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Utlidades");
                        while(!Regresar){
                            System.out.println("Menu");
                            System.out.println("1. Adivina un numero");
                            System.out.println("2. Zodiaco");
                            System.out.println("3. Regresar");
                            try {
                                System.out.println("Adivina un numero");
                                opcion = f.nextInt();
                                switch (opcion) {
                                    case 1:
                                        System.out.println("Adivina un numero");
                                        Adivina();
                                        break;
                                    case 2:
                                        System.out.println("Zodiaco");
                                        Zodiaco();
                                        break;
                                    case 3:
                                        Regresar = true;
                                        break;
                                    default:
                                        System.out.println("Solo números entre 1 y 3");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Debes insertar un número");
                                f.next();
                            }
                        }
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                f.next();
            }
        }
 
    }
    public static void Suma(){
        Scanner f = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Ingrese el primer numero");
        a = f.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = f.nextInt();
        resultado = a + b;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Resta(){
        Scanner f = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Ingrese el primer numero");
        a = f.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = f.nextInt();
        resultado = a - b;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Multiplicacion(){
        Scanner f = new Scanner(System.in);
        int a, b, resultado;
        System.out.println("Ingrese el primer numero");
        a = f.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = f.nextInt();
        resultado = a * b;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Division(){
        Scanner f = new Scanner(System.in);
        float a, b, resultado;
        System.out.println("Ingrese el primer numero");
        a = f.nextInt();
        System.out.println("Ingrese el segundo numero");
        b = f.nextInt();
        resultado = a / b;
        System.out.println("El resultado es: " + resultado);
    }
    public static void Adivina(){
        Scanner f = new Scanner(System.in);
        int a,resultado;
        System.out.println("Ingrese un numero");
        a = f.nextInt();
        resultado = (int) (Math.random() * 20 + 1);
        if (a == resultado){
            System.out.println("Felicidades, adivinaste el numero");
        }else{
            System.out.println("Lo siento, no adivinaste el numero");
        }
    }
    public static void Zodiaco(){
        //Adivinar el signo del zodiaco con la fecha de nacimiento
        Scanner f = new Scanner(System.in);
        int dia, mes;
        System.out.println("Ingrese el dia de nacimiento");
        dia = f.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mes = f.nextInt();
        if (dia >= 21 && mes == 3 || dia <= 20 && mes == 4){
            System.out.println("Tu signo es Aries");
        }else if (dia >= 21 && mes == 4 || dia <= 21 && mes == 5){
            System.out.println("Tu signo es Tauro");
        }else if (dia >= 22 && mes == 5 || dia <= 21 && mes == 6){
            System.out.println("Tu signo es Geminis");
        }else if (dia >= 22 && mes == 6 || dia <= 22 && mes == 7){
            System.out.println("Tu signo es Cancer");
        }else if (dia >= 23 && mes == 7 || dia <= 23 && mes == 8){
            System.out.println("Tu signo es Leo");
        }else if (dia >= 24 && mes == 8 || dia <= 23 && mes == 9){
            System.out.println("Tu signo es Virgo");
        }else if (dia >= 24 && mes == 9 || dia <= 23 && mes == 10){
            System.out.println("Tu signo es Libra");
        }else if (dia >= 24 && mes == 10 || dia <= 22 && mes == 11){
            System.out.println("Tu signo es Escorpio");
        }else if (dia >= 23 && mes == 11 || dia <= 21 && mes == 12){
            System.out.println("Tu signo es Sagitario");
        }else if (dia >= 22 && mes == 12 || dia <= 20 && mes == 1){
            System.out.println("Tu signo es Capricornio");
        }else if (dia >= 21 && mes == 1 || dia <= 19 && mes == 2){
            System.out.println("Tu signo es Acuario");
        }else if (dia >= 20 && mes == 2 || dia <= 20 && mes == 3){
            System.out.println("Tu signo es Piscis");
        }

    }
    public static void Factorial(){
        Scanner f = new Scanner(System.in);
        int a, resultado = 1;
        System.out.println("Ingrese un numero");
        a = f.nextInt();
        for (int i = 1; i <= a; i++){
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + a + " es " + resultado);
    }
    public static void Fibonacci(){
        Scanner f = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = f.nextInt();
        int b = 0;
        int c = 1;
        int d;
        for (int i = 1; i <= a; i++){
            d = b;
            b = c + b;
            c = d;
            System.out.println(c);
        }
    }
}