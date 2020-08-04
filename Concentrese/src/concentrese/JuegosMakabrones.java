/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concentrese;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Ingenieria asdwebs
 */
public class JuegosMakabrones extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    private Juego juego = new Juego();
    private ArrayList<Carta> cartas = juego.generarCartas();
    private boolean encontrar = true;
    private int carta1 = -1;
    private int carta2 = -1;

    public JuegosMakabrones() {
        initComponents();
        this.setPreferredSize(new Dimension(440, 640));
        this.pack();
        taparTablero();
    }

    public void taparTablero() {
        evaluarPartida();
        ImageIcon img = new ImageIcon("src/cartas/Back.jpg");
        if (cartas.get(0).estaDestapada() == false) {
            uno.setIcon(new ImageIcon(img.getImage().getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(1).estaDestapada() == false) {
            dos.setIcon(new ImageIcon(img.getImage().getScaledInstance(dos.getWidth(), dos.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(2).estaDestapada() == false) {
            tres.setIcon(new ImageIcon(img.getImage().getScaledInstance(tres.getWidth(), tres.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(3).estaDestapada() == false) {
            foooo.setIcon(new ImageIcon(img.getImage().getScaledInstance(foooo.getWidth(), foooo.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(4).estaDestapada() == false) {
            cinco.setIcon(new ImageIcon(img.getImage().getScaledInstance(cinco.getWidth(), cinco.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(5).estaDestapada() == false) {
            seis.setIcon(new ImageIcon(img.getImage().getScaledInstance(seis.getWidth(), seis.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(6).estaDestapada() == false) {
            siete.setIcon(new ImageIcon(img.getImage().getScaledInstance(siete.getWidth(), siete.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(7).estaDestapada() == false) {
            eith.setIcon(new ImageIcon(img.getImage().getScaledInstance(eith.getWidth(), eith.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(8).estaDestapada() == false) {
            nain.setIcon(new ImageIcon(img.getImage().getScaledInstance(nain.getWidth(), nain.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(9).estaDestapada() == false) {
            ten.setIcon(new ImageIcon(img.getImage().getScaledInstance(ten.getWidth(), ten.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(10).estaDestapada() == false) {
            ileven.setIcon(new ImageIcon(img.getImage().getScaledInstance(ileven.getWidth(), ileven.getHeight(), Image.SCALE_DEFAULT)));
        }
        if (cartas.get(11).estaDestapada() == false) {
            twelve.setIcon(new ImageIcon(img.getImage().getScaledInstance(twelve.getWidth(), twelve.getHeight(), Image.SCALE_DEFAULT)));
        }
    }

    public void evaluarPartida() {
        if (juego.darAciertos() == 6) {
            JOptionPane.showMessageDialog(null, "omedetto kosaimas");
        
        }
        if (juego.darVidas() == 0) {
            JOptionPane.showMessageDialog(null, "F en el chat" + "");
            System.exit(0);
        }
    }

    public void evaluarJugada() {
        if (cartas.get(carta1).darPalo().equalsIgnoreCase(cartas.get(carta2).darPalo()) && cartas.get(carta1).darEtiqueta().equalsIgnoreCase(cartas.get(carta2).darEtiqueta()) && !(cartas.get(carta1).equals(cartas.get(carta2)))) {
            juego.setAciertos(juego.darAciertos() + 1);
            aciertos.setText(juego.darAciertos() + "");
            JOptionPane.showMessageDialog(null, "Ha descubierto " + cartas.get(carta2).darEtiqueta() + " de " + devolverPalo(carta2) + "\nFelicitaciones, ha acertado");

        } else {
            juego.setVidas(juego.darVidas() - 1);
            cartas.get(carta1).tapar();
            cartas.get(carta2).tapar();
            vidas.setText(juego.darVidas() + "");
            JOptionPane.showMessageDialog(null, "Ha descubierto " + cartas.get(carta2).darEtiqueta() + " de " + devolverPalo(carta2) + "\nLo siento, ha fallado.");
            taparTablero();
        }
    }

    public String devolverPalo(int pos) {

        if (cartas.get(pos).darPalo().equalsIgnoreCase("S")) {
            return "picas";
        } else if (cartas.get(pos).darPalo().equalsIgnoreCase("H")) {
            return "corazones";
        } else if (cartas.get(pos).darPalo().equalsIgnoreCase("D")) {
            return "diamantes";
        } else if (cartas.get(pos).darPalo().equalsIgnoreCase("C")) {
            return "treboles";
        } else {
            return null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarTablero = new javax.swing.JButton();
        reinicio = new javax.swing.JButton();
        Aciertos = new javax.swing.JLabel();
        aciertos = new javax.swing.JLabel();
        Vidas = new javax.swing.JLabel();
        vidas = new javax.swing.JLabel();
        uno = new javax.swing.JLabel();
        foooo = new javax.swing.JLabel();
        dos = new javax.swing.JLabel();
        tres = new javax.swing.JLabel();
        cinco = new javax.swing.JLabel();
        seis = new javax.swing.JLabel();
        siete = new javax.swing.JLabel();
        eith = new javax.swing.JLabel();
        nain = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        ileven = new javax.swing.JLabel();
        twelve = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(null);

        mostrarTablero.setBackground(new java.awt.Color(102, 102, 102));
        mostrarTablero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mostrarTablero.setText("Mostrar tablero");
        mostrarTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarTableroMouseClicked(evt);
            }
        });
        getContentPane().add(mostrarTablero);
        mostrarTablero.setBounds(-10, 550, 450, 60);

        reinicio.setBackground(new java.awt.Color(102, 102, 102));
        reinicio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reinicio.setText("Reiniciar partida");
        reinicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reinicioMouseClicked(evt);
            }
        });
        reinicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reinicioActionPerformed(evt);
            }
        });
        getContentPane().add(reinicio);
        reinicio.setBounds(-10, 507, 450, 50);

        Aciertos.setBackground(new java.awt.Color(204, 204, 204));
        Aciertos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Aciertos.setText("Aciertos");
        Aciertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Aciertos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(Aciertos);
        Aciertos.setBounds(0, 0, 208, 30);

        aciertos.setBackground(new java.awt.Color(255, 200, 217));
        aciertos.setForeground(new java.awt.Color(51, 51, 51));
        aciertos.setText(juego.darAciertos()+"");
        aciertos.setToolTipText("");
        aciertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aciertos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(aciertos);
        aciertos.setBounds(214, 0, 220, 30);

        Vidas.setBackground(new java.awt.Color(204, 204, 204));
        Vidas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Vidas.setText("Vidas restantes");
        Vidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(Vidas);
        Vidas.setBounds(0, 36, 208, 30);

        vidas.setBackground(new java.awt.Color(255, 255, 255));
        vidas.setText(juego.darVidas()+"");
        vidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(vidas);
        vidas.setBounds(214, 36, 220, 30);

        uno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        uno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unoMouseClicked(evt);
            }
        });
        getContentPane().add(uno);
        uno.setBounds(10, 72, 96, 135);

        foooo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        foooo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fooooMouseClicked(evt);
            }
        });
        getContentPane().add(foooo);
        foooo.setBounds(316, 72, 96, 135);

        dos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dosMouseClicked(evt);
            }
        });
        getContentPane().add(dos);
        dos.setBounds(112, 72, 96, 135);

        tres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tresMouseClicked(evt);
            }
        });
        getContentPane().add(tres);
        tres.setBounds(214, 72, 96, 135);

        cinco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cinco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cincoMouseClicked(evt);
            }
        });
        getContentPane().add(cinco);
        cinco.setBounds(10, 213, 96, 135);

        seis.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        seis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seisMouseClicked(evt);
            }
        });
        getContentPane().add(seis);
        seis.setBounds(112, 213, 96, 135);

        siete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        siete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sieteMouseClicked(evt);
            }
        });
        getContentPane().add(siete);
        siete.setBounds(214, 213, 96, 135);

        eith.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eith.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eithMouseClicked(evt);
            }
        });
        getContentPane().add(eith);
        eith.setBounds(316, 213, 96, 135);

        nain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nainMouseClicked(evt);
            }
        });
        getContentPane().add(nain);
        nain.setBounds(10, 354, 96, 135);

        ten.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenMouseClicked(evt);
            }
        });
        getContentPane().add(ten);
        ten.setBounds(112, 354, 96, 135);

        ileven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ileven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ilevenMouseClicked(evt);
            }
        });
        getContentPane().add(ileven);
        ileven.setBounds(214, 354, 96, 135);

        twelve.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        twelve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twelveMouseClicked(evt);
            }
        });
        getContentPane().add(twelve);
        twelve.setBounds(316, 354, 96, 135);

        jPanel1.setBackground(new java.awt.Color(236, 242, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(-10, -10, 460, 620);

        jPanel2.setBackground(new java.awt.Color(240, 198, 210));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(340, 0, 100, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reinicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reinicioMouseClicked
        cartas = juego.generarCartas();
        taparTablero();
        juego.reiniciarAciertos();
        aciertos.setText(juego.darAciertos() + "");
        juego.reiniciarVidas();
        vidas.setText(juego.darVidas() + "");
        encontrar = true;
    }//GEN-LAST:event_reinicioMouseClicked
    public void mostrarTablero() {
        System.out.println("");
        System.out.println("");
        System.out.print(" "+cartas.get(0).toString() + " | ");
        System.out.print(cartas.get(1).toString() + " | ");
        System.out.print(cartas.get(2).toString() + " | ");
        System.out.println(cartas.get(3).toString() +"  ");
      
        System.out.print("----+----+----+----");
        System.out.println("");
        System.out.print(" "+cartas.get(4).toString() + " | ");
        System.out.print(cartas.get(5).toString() + " | ");
        System.out.print(cartas.get(6).toString() + " | ");
        System.out.println(cartas.get(7).toString() + "  ");
        System.out.print("----+----+----+----");
        System.out.println("");
        System.out.print(" "+cartas.get(8).toString() + " | ");
        System.out.print(cartas.get(9).toString() + " | ");
        System.out.print(cartas.get(10).toString() + " | ");
        System.out.print(cartas.get(11).toString() + "  ");

        ImageIcon i1 = new ImageIcon("src/cartas/" + cartas.get(0).toString() + ".jpg");
        uno.setIcon(new ImageIcon(i1.getImage().getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i2 = new ImageIcon("src/cartas/" + cartas.get(1).toString() + ".jpg");
        dos.setIcon(new ImageIcon(i2.getImage().getScaledInstance(dos.getWidth(), dos.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i3 = new ImageIcon("src/cartas/" + cartas.get(2).toString() + ".jpg");
        tres.setIcon(new ImageIcon(i3.getImage().getScaledInstance(tres.getWidth(), tres.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i4 = new ImageIcon("src/cartas/" + cartas.get(3).toString() + ".jpg");
        foooo.setIcon(new ImageIcon(i4.getImage().getScaledInstance(foooo.getWidth(), foooo.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i5 = new ImageIcon("src/cartas/" + cartas.get(4).toString() + ".jpg");
        cinco.setIcon(new ImageIcon(i5.getImage().getScaledInstance(cinco.getWidth(), cinco.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i6 = new ImageIcon("src/cartas/" + cartas.get(5).toString() + ".jpg");
        seis.setIcon(new ImageIcon(i6.getImage().getScaledInstance(seis.getWidth(), seis.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i7 = new ImageIcon("src/cartas/" + cartas.get(6).toString() + ".jpg");
        siete.setIcon(new ImageIcon(i7.getImage().getScaledInstance(siete.getWidth(), siete.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i8 = new ImageIcon("src/cartas/" + cartas.get(7).toString() + ".jpg");
        eith.setIcon(new ImageIcon(i8.getImage().getScaledInstance(eith.getWidth(), eith.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i9 = new ImageIcon("src/cartas/" + cartas.get(8).toString() + ".jpg");
        nain.setIcon(new ImageIcon(i9.getImage().getScaledInstance(nain.getWidth(), nain.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i10 = new ImageIcon("src/cartas/" + cartas.get(9).toString() + ".jpg");
        ten.setIcon(new ImageIcon(i10.getImage().getScaledInstance(ten.getWidth(), ten.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i11 = new ImageIcon("src/cartas/" + cartas.get(10).toString() + ".jpg");
        ileven.setIcon(new ImageIcon(i11.getImage().getScaledInstance(ileven.getWidth(), ileven.getHeight(), Image.SCALE_DEFAULT)));
        ImageIcon i12 = new ImageIcon("src/cartas/" + cartas.get(11).toString() + ".jpg");
        twelve.setIcon(new ImageIcon(i12.getImage().getScaledInstance(twelve.getWidth(), twelve.getHeight(), Image.SCALE_DEFAULT)));

    }
    private void unoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unoMouseClicked
        // TODO add your handling code here:
        ImageIcon i = new ImageIcon("src/cartas/" + cartas.get(0).toString() + ".jpg");
        uno.setIcon(new ImageIcon(i.getImage().getScaledInstance(uno.getWidth(), uno.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(0).destapar();
        if (encontrar == true) {
            carta1 = 0;
            encontrar = false;
        } else {
            carta2 = 0;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_unoMouseClicked

    private void dosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dosMouseClicked
        // TODO add your handling code here:
        ImageIcon i2 = new ImageIcon("src/cartas/" + cartas.get(1).toString() + ".jpg");
        dos.setIcon(new ImageIcon(i2.getImage().getScaledInstance(dos.getWidth(), dos.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(1).destapar();

        if (encontrar == true) {
            carta1 = 1;
            encontrar = false;
        } else {
            carta2 = 1;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_dosMouseClicked

    private void tresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tresMouseClicked
        // TODO add your handling code here:
        ImageIcon i3 = new ImageIcon("src/cartas/" + cartas.get(2).toString() + ".jpg");
        tres.setIcon(new ImageIcon(i3.getImage().getScaledInstance(tres.getWidth(), tres.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(2).destapar();
        if (encontrar == true) {
            carta1 = 2;
            encontrar = false;
        } else {
            carta2 = 2;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_tresMouseClicked

    private void fooooMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fooooMouseClicked
        // TODO add your handling code here:
        ImageIcon i4 = new ImageIcon("src/cartas/" + cartas.get(3).toString() + ".jpg");
        foooo.setIcon(new ImageIcon(i4.getImage().getScaledInstance(foooo.getWidth(), foooo.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(3).destapar();
        if (encontrar == true) {
            carta1 = 3;
            encontrar = false;
        } else {
            carta2 = 3;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_fooooMouseClicked

    private void cincoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cincoMouseClicked
        // TODO add your handling code here:
        ImageIcon i5 = new ImageIcon("src/cartas/" + cartas.get(4).toString() + ".jpg");
        cinco.setIcon(new ImageIcon(i5.getImage().getScaledInstance(cinco.getWidth(), cinco.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(4).destapar();
        if (encontrar == true) {
            carta1 = 4;
            encontrar = false;
        } else {
            carta2 = 4;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_cincoMouseClicked

    private void seisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seisMouseClicked
        // TODO add your handling code here:
        ImageIcon i6 = new ImageIcon("src/cartas/" + cartas.get(5).toString() + ".jpg");
        seis.setIcon(new ImageIcon(i6.getImage().getScaledInstance(seis.getWidth(), seis.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(5).destapar();
        if (encontrar == true) {
            carta1 = 5;
            encontrar = false;
        } else {
            carta2 = 5;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_seisMouseClicked

    private void sieteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sieteMouseClicked
        // TODO add your handling code here:
        ImageIcon i7 = new ImageIcon("src/cartas/" + cartas.get(6).toString() + ".jpg");
        siete.setIcon(new ImageIcon(i7.getImage().getScaledInstance(siete.getWidth(), siete.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(6).destapar();
        if (encontrar == true) {
            carta1 = 6;
            encontrar = false;
        } else {
            carta2 = 6;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_sieteMouseClicked

    private void eithMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eithMouseClicked
        // TODO add your handling code here:
        ImageIcon i8 = new ImageIcon("src/cartas/" + cartas.get(7).toString() + ".jpg");
        eith.setIcon(new ImageIcon(i8.getImage().getScaledInstance(eith.getWidth(), eith.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(7).destapar();
        if (encontrar == true) {
            carta1 = 7;
            encontrar = false;
        } else {
            carta2 = 7;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_eithMouseClicked

    private void nainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nainMouseClicked
        // TODO add your handling code here:
        ImageIcon i9 = new ImageIcon("src/cartas/" + cartas.get(8).toString() + ".jpg");
        nain.setIcon(new ImageIcon(i9.getImage().getScaledInstance(nain.getWidth(), nain.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(8).destapar();
        if (encontrar == true) {
            carta1 = 8;
            encontrar = false;
        } else {
            carta2 = 8;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_nainMouseClicked

    private void tenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tenMouseClicked
        // TODO add your handling code here:
        ImageIcon i10 = new ImageIcon("src/cartas/" + cartas.get(9).toString() + ".jpg");
        ten.setIcon(new ImageIcon(i10.getImage().getScaledInstance(ten.getWidth(), ten.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(9).destapar();
        if (encontrar == true) {
            carta1 = 9;
            encontrar = false;
        } else {
            carta2 = 9;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_tenMouseClicked

    private void ilevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ilevenMouseClicked
        // TODO add your handling code here:
        ImageIcon i11 = new ImageIcon("src/cartas/" + cartas.get(10).toString() + ".jpg");
        ileven.setIcon(new ImageIcon(i11.getImage().getScaledInstance(ileven.getWidth(), ileven.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(10).destapar();
        if (encontrar == true) {
            carta1 = 10;
            encontrar = false;
        } else {
            carta2 = 10;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_ilevenMouseClicked

    private void twelveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twelveMouseClicked
        // TODO add your handling code here:
        ImageIcon i12 = new ImageIcon("src/cartas/" + cartas.get(11).toString() + ".jpg");
        twelve.setIcon(new ImageIcon(i12.getImage().getScaledInstance(twelve.getWidth(), twelve.getHeight(), Image.SCALE_DEFAULT)));
        cartas.get(11).destapar();
        if (encontrar == true) {
            carta1 = 11;
            encontrar = false;
        } else {
            carta2 = 11;
            encontrar = true;
            evaluarJugada();
        }
    }//GEN-LAST:event_twelveMouseClicked

    private void mostrarTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarTableroMouseClicked
        mostrarTablero();
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                taparTablero();
            }
        }, 500
        );

    }//GEN-LAST:event_mostrarTableroMouseClicked

    private void reinicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reinicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reinicioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JuegosMakabrones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegosMakabrones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegosMakabrones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegosMakabrones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JuegosMakabrones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Aciertos;
    private javax.swing.JLabel Vidas;
    private javax.swing.JLabel aciertos;
    private javax.swing.JLabel cinco;
    private javax.swing.JLabel dos;
    private javax.swing.JLabel eith;
    private javax.swing.JLabel foooo;
    private javax.swing.JLabel ileven;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton mostrarTablero;
    private javax.swing.JLabel nain;
    private javax.swing.JButton reinicio;
    private javax.swing.JLabel seis;
    private javax.swing.JLabel siete;
    private javax.swing.JLabel ten;
    private javax.swing.JLabel tres;
    private javax.swing.JLabel twelve;
    private javax.swing.JLabel uno;
    private javax.swing.JLabel vidas;
    // End of variables declaration//GEN-END:variables
}
