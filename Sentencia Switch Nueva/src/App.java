import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner lector = new Scanner (System.in);
        System.out.println("Color del semaforo: (r/a/v)");
        char color = lector.next().charAt(0);
        // Sentencia Switch
        // Se usa -> en lugar del:
        //Para no necesitar boner la sentencia break;
        switch (color) {
            case 'a' -> {
                System.out.println("El semaforo esta en amarillo.");
            }

            case 'r' -> {
                System.out.println("El semaforo esta en rojo.");

            }

            case 'v' -> {
                System.out.println("El semaforo esta en verde.");

            }
                 
            default -> {
                System.out.println("Color incorrecto.");

            }
                
        }
        lector.close();
    }
}
