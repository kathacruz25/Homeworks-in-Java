package concentrese;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Juego {

    private int aciertos = 0;
    private int vidas = 6;
    private final Carta[][] juego = new Carta[3][4];

    public Juego() {
        llenarTablero();
    }

    public void llenarTablero() {
        ArrayList<Carta> cartas = generarCartas();
        int cont = 0;
        for (int i = 0; i < juego.length; i++) {
            for (int j = 0; j < juego[i].length; j++) {
                juego[i][j] = cartas.get(cont);
                cont++;
            }
        }
    }

    public ArrayList<Carta> generarCartas() {
        Carta c;
        ArrayList<Carta> cartasT = new ArrayList<Carta>();
        String[] palo = {"S", "H", "D", "C"};
        String[] etiqueta = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                c = new Carta(etiqueta[j], palo[i]);
                cartasT.add(c);
            }
        }

        ArrayList<Carta> cartas = new ArrayList<Carta>();
        for (int i = 0; i <6; i++) {
            int alea = new Random().nextInt(cartasT.size() - 1);
            cartas.add(cartasT.get(alea));

            cartas.add(cartasT.get(alea).darCopia());
            cartasT.remove(alea);
        }
        Collections.shuffle(cartas);
        return cartas;
    }

    public int darAciertos() {
        return aciertos;
    }

    public int darVidas() {
        return vidas;
    }

    public void reiniciarVidas() {
        vidas = 6;
    }

    public void reiniciarAciertos() {
        aciertos = 0;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void destaparCartas() {
        String tab = "";
        for (int i = 0; i < juego.length; i++) {
            if (i == 0) {
                tab += "\n";
            } else {
                tab += "\n----+----+----+----\n";
            }
            for (int j = 0; j < juego[i].length; j++) {
                if (j == 0) {
                    tab += " " + juego[i][j] + " ";
                } else {
                    tab += "| " + juego[i][j] + " ";
                }
            }
        }
        System.out.println(tab);
    }

    public Carta primeraCarta(int fila, int columna) {
        juego[fila][columna].destapar();
        return juego[fila][columna];
    }

    public Carta segundaCarta(int fila, int columna) {
        juego[fila][columna].destapar();
        return juego[fila][columna];
    }
    
    public void evaluarJugada(Carta c1, Carta c2) {
        if (c1.darPalo().equalsIgnoreCase(c2.darPalo()) && c1.darEtiqueta().equalsIgnoreCase(c2.darEtiqueta())) {
            System.out.println("Felicitaciones ha acertado :)");
            aciertos++;
        } else {
            System.out.println("Lo siento ha fallado :(");
            vidas--;
            c1.tapar();
            c2.tapar();
        }
    }
    
    public void evaluarPartida() {
        System.out.println();
        if (aciertos == 12) {
            System.out.println("FELICITACIONES, HAS GANADO EL JUEGO.");
            System.exit(0);
        } else {

        }
        if (vidas == 0) {
            System.out.println("LO SIENTO, HAS PERDIDO EL JUEGO.");
            System.exit(0);
        }

    }

    public String devolverPalo(int fila, int columna) {

        if (juego[fila][columna].darPalo().equalsIgnoreCase("S")) {
            return "picas";
        } else if (juego[fila][columna].darPalo().equalsIgnoreCase("H")) {
            return "corazones";
        } else if (juego[fila][columna].darPalo().equalsIgnoreCase("D")) {
            return "diamantes";
        } else if (juego[fila][columna].darPalo().equalsIgnoreCase("C")) {
            return "treboles";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        String matriz = "";
        for (int i = 0; i < juego.length; i++) {
            if (i == 0) {
                matriz += "\n";
            } else {
                matriz += "\n----+----+----+----\n";
            }
            for (int j = 0; j < juego[i].length; j++) {
                if (j == 0) {
                    if (juego[i][j].estaDestapada() == true) {
                        matriz += " " + juego[i][j] + " ";
                    } else {
                        matriz += " XX ";
                    }
                } else {
                    if (juego[i][j].estaDestapada() == true) {
                        matriz += "| " + juego[i][j] + " ";
                    } else {
                        matriz += "| XX ";
                    }
                }

            }
        }
        return matriz;
    }

}
