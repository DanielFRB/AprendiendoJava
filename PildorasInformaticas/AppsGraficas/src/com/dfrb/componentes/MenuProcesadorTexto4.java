package com.dfrb.componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTexto4 {
    public static void main(String[] args) {
        MarcoProcesadorTexto4 miMarco = new MarcoProcesadorTexto4();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoProcesadorTexto4 extends JFrame {
    public MarcoProcesadorTexto4() {
        setTitle("Procesador de Textos con Imagenes, CheckBox y ComboBox");
        setBounds(500, 280, 600, 350);
        LaminaProcesadorTexto4 miLamina = new LaminaProcesadorTexto4();
        add(miLamina);
    }
}

class LaminaProcesadorTexto4 extends JPanel {
    public LaminaProcesadorTexto4() {
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
        JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/images/negrita.png"));
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/images/cursiva.png"));
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        menuEstilo.add(negrita);
        menuEstilo.add(cursiva);
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
        }
    }
    
    
    private JTextPane miPane;
    private JMenu menuFuente, menuEstilo, menuTamagno;
    private Font letras;
}
