package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTexto8 {
    public static void main(String[] args) {
        MarcoProcesadorTexto8 miMarco = new MarcoProcesadorTexto8();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoProcesadorTexto8 extends JFrame {
    public MarcoProcesadorTexto8() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Procesador de Textos con Barras de Herramientas 2");
        LaminaProcesadorTexto8 miLamina = new LaminaProcesadorTexto8();
        add(miLamina);
    }
}

class LaminaProcesadorTexto8 extends JPanel {
    public LaminaProcesadorTexto8() {
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
        Font fuente = new Font("Arial", Font.PLAIN, 16);
        miPane = new JTextPane();
        miPane.setFont(fuente);
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
        JToolBar miBarra = new JToolBar();
        JButton btnNegrita = new JButton(new ImageIcon("src/images/negrita.png"));
        JButton btnCursiva = new JButton(new ImageIcon("src/images/cursiva.png"));
        JButton btnSubraya = new JButton(new ImageIcon("src/images/subraya.png"));
        JButton btnAmarillo = new JButton(new ImageIcon("src/images/bolaAmarilla.gif"));
        JButton btnAzul = new JButton(new ImageIcon("src/images/bolaAzul.gif"));
        JButton btnRojo = new JButton(new ImageIcon("src/images/bolaRoja.gif"));
        JButton btnCenter = new JButton(new ImageIcon("src/images/center.png"));
        JButton btnRight = new JButton(new ImageIcon("src/images/right.png"));
        JButton btnLeft = new JButton(new ImageIcon("src/images/left.png"));
        JButton btnJustify = new JButton(new ImageIcon("src/images/justify.png"));
        btnNegrita.addActionListener(new StyledEditorKit.BoldAction());
        btnCursiva.addActionListener(new StyledEditorKit.ItalicAction());
        btnSubraya.addActionListener(new StyledEditorKit.UnderlineAction());
        btnAmarillo.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
        btnAzul.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.BLUE));
        btnRojo.addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.RED));
        btnLeft.addActionListener(new StyledEditorKit.AlignmentAction("Left", 0));
        btnRight.addActionListener(new StyledEditorKit.AlignmentAction("Right", 2));
        btnCenter.addActionListener(new StyledEditorKit.AlignmentAction("Center", 1));
        btnJustify.addActionListener(new StyledEditorKit.AlignmentAction("Justity", 3));
        miBarra.add(btnNegrita);
        miBarra.add(btnCursiva);
        miBarra.add(btnSubraya);
        miBarra.add(btnAmarillo);
        miBarra.add(btnAzul);
        miBarra.add(btnRojo);
        miBarra.add(btnLeft);
        miBarra.add(btnRight);
        miBarra.add(btnCenter);
        miBarra.add(btnJustify);
        miBarra.setOrientation(1);
        add(miBarra, BorderLayout.WEST);
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
