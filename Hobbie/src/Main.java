import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opcion;
        System.out.println("-------MENU-------");
        System.out.println("1. Entretenimiento");
        System.out.println("2. Deporte");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una opcion: ");
        opcion = entrada.nextInt();

        if (opcion==1){
            Hobbie hobbie = new Hobbie("Acampar", "exploracion");
            System.out.println(hobbie.Informacion());

        }
        else if (opcion==2){
            Deporte deporte = new Deporte("Futbol", "deporte", "futbol soccer", "juego con piernas");
            System.out.println(deporte.Informacion());
        }

    }

}