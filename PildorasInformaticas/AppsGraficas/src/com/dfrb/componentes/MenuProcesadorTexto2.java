package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTexto2 {
    public static void main(String[] args) {
        MarcoProcesadorTexto2 miMarco = new MarcoProcesadorTexto2();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoProcesadorTexto2 extends JFrame {
    public MarcoProcesadorTexto2() {
        setTitle("Procesador de Textos V1.1");
        setBounds(500, 280, 600, 350);
        LaminaProcesadorTexto2 miLamina = new LaminaProcesadorTexto2();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaProcesadorTexto2 extends JPanel {
    public LaminaProcesadorTexto2() {
        setLayout(new BorderLayout());
        JPanel laminaMenus = new JPanel();
        JMenuBar miMenuBar = new JMenuBar();
        menuFuente = new JMenu("Fuente");
        menuEstilo = new JMenu("Estilos");
        menuTamagno = new JMenu("Tamaño");
        configMenu("menuFuente", "Arial", "Arial", 9, 12);
        configMenu("menuFuente", "Serif", "Serif", 9, 12);
        configMenu("menuFuente", "Verdana", "Verdana", 9, 12);
        // -------------------------------------------------------------------------------------------------------------------
        configMenu("menuEstilo", "Negrita", "", Font.BOLD, 12);
        configMenu("menuEstilo", "Cursiva", "", Font.ITALIC, 12);
        // -------------------------------------------------------------------------------------------------------------------
        configMenu("menuTamagno", "12", "", 9, 12);
        configMenu("menuTamagno", "18", "", 9, 18);
        configMenu("menuTamagno", "24", "", 9, 24);
        configMenu("menuTamagno", "32", "", 9, 32);
        
        miMenuBar.add(menuFuente);
        miMenuBar.add(menuEstilo);
        miMenuBar.add(menuTamagno);
        laminaMenus.add(miMenuBar);
        add(laminaMenus, BorderLayout.NORTH);
        miPane = new JTextPane();
        add(miPane, BorderLayout.CENTER);
    }
    
    public void configMenu(String menu, String menuItem, String tipoLetra, int estilo, int tamagno) {
        JMenuItem miItem = new JMenuItem(menuItem);
        switch (menu) {
            case "menuFuente" :
                menuFuente.add(miItem);
            break;
            case "menuEstilo" :
                menuEstilo.add(miItem);
            break;
            case "menuTamagno" :
                menuTamagno.add(miItem);
            break;
        }
        miItem.addActionListener(new GestionaEventos(menuItem, tipoLetra, estilo, tamagno));
    }
    
    private class GestionaEventos implements ActionListener {
        public GestionaEventos(String menuItem, String tipoDeLetra, int tipoEstilo, int tamLetra) {
            menu = menuItem;
            tipoLetra = tipoDeLetra;
            estilo = tipoEstilo;
            tamagno = tamLetra;
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
            letras = miPane.getFont();
            if (menu.equals("Arial") || menu.equals("Serif") || menu.equals("Verdana")) {
                estilo = letras.getStyle();
                tamagno = letras.getSize();
            } else if (menu.equals("Negrita") || menu.equals("Cursiva")) {
                if (letras.getStyle() == 1 || letras.getStyle() == 2) {
                    estilo = 3;
                }
                tipoLetra = letras.getFontName();
                tamagno = letras.getSize();
            } else if (menu.equals("12") || menu.equals("18") || menu.equals("24") || menu.equals("32")) {
                estilo = letras.getStyle();
                tipoLetra = letras.getFontName();
            }
            miPane.setFont(new Font(tipoLetra, estilo, tamagno));
            System.out.println("Tipo: "+ tipoLetra +", Estilo: "+ estilo +", Tamaño: "+ tamagno);
        }
        
        private String menu, tipoLetra;
        private int estilo, tamagno;
    }
    
    private JTextPane miPane;
    private JMenu menuFuente, menuEstilo, menuTamagno;
    private Font letras;
}
