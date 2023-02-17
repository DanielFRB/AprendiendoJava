package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTexto6 {
    public static void main(String[] args) {
        MarcoProcesadorTexto6 miMarco = new MarcoProcesadorTexto6();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoProcesadorTexto6 extends JFrame {
    public MarcoProcesadorTexto6() {
        setTitle("Procesador de Textos con Atajos de teclado");
        setBounds(500, 280, 600, 350);
        LaminaProcesadorTexto6 miLamina = new LaminaProcesadorTexto6();
        add(miLamina);
    }
}

class LaminaProcesadorTexto6 extends JPanel {
    public LaminaProcesadorTexto6() {
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
        
        /* JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/images/negrita.png"));
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/images/cursiva.png"));
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        menuEstilo.add(negrita);
        menuEstilo.add(cursiva); */
        // -------------------------------------------------------------------------------------------------------------------
        ButtonGroup tamagnoLetra = new ButtonGroup();
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
        JRadioButtonMenuItem cuarentaYdos = new JRadioButtonMenuItem("42");
        tamagnoLetra.add(doce);
        tamagnoLetra.add(dieciseis);
        tamagnoLetra.add(veinticuatro);
        tamagnoLetra.add(cuarentaYdos);
        doce.addActionListener(new StyledEditorKit.FontSizeAction("changeSize", 12));
        dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("changeSize", 16));
        veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("changeSize", 24));
        cuarentaYdos.addActionListener(new StyledEditorKit.FontSizeAction("changeSize", 42));
        menuTamagno.add(doce);
        menuTamagno.add(dieciseis);
        menuTamagno.add(veinticuatro);
        menuTamagno.add(cuarentaYdos);
        // -------------------------------------------------------------------------------------------------------------------
        miMenuBar.add(menuFuente);
        miMenuBar.add(menuEstilo);
        miMenuBar.add(menuTamagno);
        laminaMenus.add(miMenuBar);
        add(laminaMenus, BorderLayout.NORTH);
        miPane = new JTextPane();
        add(miPane, BorderLayout.CENTER);
        // -------------------------------------------------------------------------------------------------------------------
        JPopupMenu menuEmergente = new JPopupMenu();
        JMenuItem opc1 = new JMenuItem("Negrita");
        JMenuItem opc2 = new JMenuItem("Cursiva");
        menuEmergente.add(opc1);
        menuEmergente.add(opc2);
        opc1.addActionListener(new StyledEditorKit.BoldAction());
        opc2.addActionListener(new StyledEditorKit.ItalicAction());
        miPane.setComponentPopupMenu(menuEmergente);
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
                    miItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                    miItem.addActionListener(new StyledEditorKit.BoldAction());
                } else if (estilo == Font.ITALIC) {
                    miItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                    miItem.addActionListener(new StyledEditorKit.ItalicAction());
                }
            break;
        }
    }
    
    private JTextPane miPane;
    private JMenu menuFuente, menuEstilo, menuTamagno;
    private Font letras;
}
