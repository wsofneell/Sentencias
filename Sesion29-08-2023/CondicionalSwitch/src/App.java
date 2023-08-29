import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Condicional switch-Condicional multiple
        Scanner lector = new Scanner (System.in);
        double valorA, valorB, resultado;
        double cociente = 0.0;
        System.out.println("Menu de opciones: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        byte opc = lector.nextByte();

        switch (opc) {
            case 1:
                System.out.println("1. Sumar");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                resultado = valorA + valorB;
                System.out.println("El resultado es: " + resultado);

                break;
            case 2:
                System.out.println("2. Restar");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                resultado = valorA - valorB;
                System.out.println("El resultado es: " + resultado);
                
                break;
            case 3:
                System.out.println("3. Multiplicar");
                System.out.println("Ingrese A:");
                valorA = lector.nextDouble();
                System.out.println("Ingrese B:");
                valorB = lector.nextDouble();
                resultado = valorA * valorB;
                System.out.println("El resultado es: " + resultado);
                
                break;
            case 4:
                System.out.println("4. Dividir");
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
            case 5:
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
