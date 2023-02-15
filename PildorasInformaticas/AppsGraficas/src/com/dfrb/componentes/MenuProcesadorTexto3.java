package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTexto3 {
    public static void main(String[] args) {
        MarcoProcesadorTexto3 miMarco = new MarcoProcesadorTexto3();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoProcesadorTexto3 extends JFrame {
    public MarcoProcesadorTexto3() {
        setTitle("Procesador de Textos V1.1");
        setBounds(500, 280, 600, 350);
        LaminaProcesadorTexto3 miLamina = new LaminaProcesadorTexto3();
        add(miLamina);
        setVisible(true);
    }
}

class LaminaProcesadorTexto3 extends JPanel {
    public LaminaProcesadorTexto3() {
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
                if ("Arial".equals(tipoLetra)) {
                    miItem.addActionListener(new StyledEditorKit.FontFamilyAction("changeFont", tipoLetra));
                } else if ("Serif".equals(tipoLetra)) {
                    miItem.addActionListener(new StyledEditorKit.FontFamilyAction("changeFont", tipoLetra));
                } else if ("Verdana".equals(tipoLetra)) {
                    miItem.addActionListener(new StyledEditorKit.FontFamilyAction("changeFont", tipoLetra));
                }
            break;
            case "menuEstilo" :
                menuEstilo.add(miItem);
                if (estilo == Font.BOLD) {
                    miItem.addActionListener(new StyledEditorKit.BoldAction());
                } else if (estilo == Font.ITALIC) {
                    miItem.addActionListener(new StyledEditorKit.ItalicAction());
                }
            break;
            case "menuTamagno" :
                menuTamagno.add(miItem);
                miItem.addActionListener(new StyledEditorKit.FontSizeAction("changeSize", tamagno));
            break;
        }
    }
    
    
    private JTextPane miPane;
    private JMenu menuFuente, menuEstilo, menuTamagno;
    private Font letras;
}
