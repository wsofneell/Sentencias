import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Condicional switch-Condicional multiple
        Scanner lector = new Scanner (System.in);
        double valorA, valorB, resultado;
        double cociente = 0.0;
        System.out.println("Menu de opciones: ");
        System.out.println("a. Sumar");
        System.out.println("b. Restar");
        System.out.println("c. Multiplicar");
        System.out.println("d. Dividir");
        System.out.println("e. Exponente");
        System.out.println("f. Radicacion");
        System.out.println("g. Salir");
        char opc = lector.next().charAt(0);

        switch (opc) {
            case 'A':
            case 'a':
                System.out.println("a. Sumar");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                resultado = valorA + valorB;
                System.out.println("El resultado es: " + resultado);
                break;
            case 'B':
            case 'b':
                System.out.println("b. Restar");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                resultado = valorA - valorB;
                System.out.println("El resultado es: " + resultado);
                break;
            case 'C':
            case 'c':
                System.out.println("c. Multiplicar");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                resultado = valorA * valorB;
                System.out.println("El resultado es: " + resultado);
                break;
                
            case 'd':
                System.out.println("d. Dividir");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                if (valorB == 0) {
                    System.out.println("El divisor no puede ser 0.");
                    
                } else {
                    cociente = valorA / valorB;
                    System.out.println("El resultado es: " + cociente);
                }
                break;
             case 'e':
                System.out.println("e. Potenciacion");
                System.out.println("Ingrese la base:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese el exponente:");
                valorB = lector.nextDouble();
                resultado = Math.pow(valorA, valorB);
                System.out.println("El resultado es: " + resultado);
                
                break;
             case 'f':
                System.out.println("f. Radicacion");
                System.out.println("Radicando:");
                valorA = lector.nextDouble();
                resultado = Math.sqrt(valorA);
            
                if (valorA < 0) {
                    System.out.println("El radicando no puede ser 0");
                    System.out.println("El resultado es un numero complejo o imaginario");
                    
                } else {
                    System.out.println("La raiz cuadrada es: " + resultado);
                }
                break;
            case 'g':
                System.out.println("Saliendo de la App");
                break;
            default:
                System.out.println("Opcion incorrecta");
                System.out.println("Saliendo de la App");
                break;
        }
        lector.close();
    }
}
