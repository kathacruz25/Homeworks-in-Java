package concentrese;

import java.util.Scanner;

public class Menu {
    
    private Juego juego = new Juego();
    
    private Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        JuegosMakabrones m=new JuegosMakabrones();
        m.setVisible(true);
        /*Menu menu = new Menu();
        menu.desplegarMenu();*/
    }
    
    private void desplegarMenu() {
        mostrarOpciones();
        String lineaConsola = sc.nextLine();
        int opcionSeleccionada = Integer.parseInt(lineaConsola);
        ejecutarOpcion(opcionSeleccionada);
        desplegarMenu();
    }
    
    private void mostrarOpciones() {
        System.out.println("Tablero: ");
        System.out.println(juego);
        System.out.println();
        System.out.println("Aciertos: " + juego.darAciertos());
        System.out.println("Vidas restantes: " + juego.darVidas());
        System.out.println();
        String strMenu = "Digite alguna de las siguientes opciones.\n";
        strMenu += "   1. Reiniciar partida.\n";
        strMenu += "   2. Destapar cartas.\n";
        strMenu += "   3. Hacer jugada.\n";
        strMenu += "   4. Reiniciar vidas.\n";
        strMenu += "   5. Salir.\n";
        strMenu += "\n";
        System.out.print(strMenu);
    }
    
    private void ejecutarOpcion(int opcionSeleccionada) {
        switch (opcionSeleccionada) {
            case 1:
                reiniciarPartida();
                break;
            
            case 2:
                destaparCartas();
                break;
            
            case 3:
                hacerJugada();
                break;
            
            case 4:
                reiniciarVidas();
                break;
            
            case 5:
                System.exit(0);
                break;
            
        }
    }
    
    private void reiniciarPartida() {
        System.out.println("Opcion 1, reiniciar partida.");
        System.out.println("Salida:");
        System.out.println();
        juego.llenarTablero();
        juego.reiniciarAciertos();
        juego.reiniciarVidas();
        System.out.println("Se ha reiniciado la partida.");
    }
    
    private void destaparCartas() {
        System.out.println("Opcion 2, mostrar tablero.");
        System.out.println("Salida:");
        System.out.println();
        System.out.println("Tablero revelado:");
        juego.destaparCartas();
        System.out.println();
    }
    
    private void hacerJugada() {
        System.out.println("Opcion 3, hacer jugada.");
        System.out.println("Ingrese las coordenadas de la carta que desea descubrir:");
        String linea = sc.nextLine();
        String[] datos = linea.split("&");
        int fila1 = Integer.parseInt(datos[0])-1;
        int columna1 = Integer.parseInt(datos[1])-1;
        juego.primeraCarta(fila1, columna1);
        System.out.println(juego);
        System.out.print("Ha descubierto " + juego.primeraCarta(fila1, columna1).darEtiqueta() + " de " + juego.devolverPalo(fila1, columna1) + ".");
        System.out.println("Ingrese las coordenadas de la segunda carta: ");
        String linea2 = sc.nextLine();
        String[] datos2 = linea2.split("&");
        int fila2 = Integer.parseInt(datos2[0])-1;
        int columna2 = Integer.parseInt(datos2[1])-1;
        juego.segundaCarta(fila2, columna2);
        System.out.println(juego);
        System.out.print("Ha descubierto " + juego.primeraCarta(fila2, columna2).darEtiqueta() + " de " + juego.devolverPalo(fila2, columna2) + ".");
        Carta c1=juego.primeraCarta(fila1, columna1);
        Carta c2=juego.segundaCarta(fila2, columna2);
        juego.evaluarJugada(c1, c2);
        juego.evaluarPartida();
    }
    
    private void reiniciarVidas() {
        System.out.println("Opcion 4, reiniciar vidas.");
        System.out.println("Salida:");
        System.out.println();
        juego.reiniciarVidas();
        System.out.println("Se han restaurado las vidas.");
    }
    
}
