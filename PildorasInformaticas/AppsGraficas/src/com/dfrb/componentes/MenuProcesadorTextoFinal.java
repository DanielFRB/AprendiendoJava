package com.dfrb.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.text.*;

/**
 * @author dfrb@ne
 */

public class MenuProcesadorTextoFinal {
    public static void main(String[] args) {
        MarcoProcesadorTextoFinal miMarco = new MarcoProcesadorTextoFinal();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miMarco.setVisible(true);
    }
}

class MarcoProcesadorTextoFinal extends JFrame {
    public MarcoProcesadorTextoFinal() {
        Toolkit pantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = pantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        setBounds(anchoPantalla/4, alturaPantalla/4, anchoPantalla/2, alturaPantalla/2);
        Image icono = pantalla.getImage("src/images/favicon.png");
        setIconImage(icono);
        setTitle("Procesador de Textos con Barras de Herramientas, Menu Emergente, Atajos de Teclado y otros Final");
        LaminaProcesadorTextoFinal miLamina = new LaminaProcesadorTextoFinal();
        add(miLamina);
    }
}

class LaminaProcesadorTextoFinal extends JPanel {
    public LaminaProcesadorTextoFinal() {
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
        miBarra = new JToolBar();
        configBarra("src/images/negrita.png").addActionListener(new StyledEditorKit.BoldAction());
        configBarra("src/images/cursiva.png").addActionListener(new StyledEditorKit.ItalicAction());
        configBarra("src/images/subraya.png").addActionListener(new StyledEditorKit.UnderlineAction());
        miBarra.addSeparator();
        configBarra("src/images/bolaAmarilla.gif").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.YELLOW));
        configBarra("src/images/bolaAzul.gif").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.BLUE));
        configBarra("src/images/bolaRoja.gif").addActionListener(new StyledEditorKit.ForegroundAction("Amarillo", Color.RED));
        miBarra.addSeparator();
        configBarra("src/images/left.png").addActionListener(new StyledEditorKit.AlignmentAction("Left", 0));
        configBarra("src/images/right.png").addActionListener(new StyledEditorKit.AlignmentAction("Right", 2));
        configBarra("src/images/center.png").addActionListener(new StyledEditorKit.AlignmentAction("Center", 1));
        configBarra("src/images/justify.png").addActionListener(new StyledEditorKit.AlignmentAction("Justity", 3));
        
        miBarra.setOrientation(1);
        add(miBarra, BorderLayout.WEST);
    }
    
    public JButton configBarra(String ruta) {
        JButton btn = new JButton(new ImageIcon(ruta));
        miBarra.add(btn);
        return btn;
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
    private JButton btnNegrita, btnCursiva, btnSubraya, btnAmarillo, btnAzul, btnRojo, btnLeft, btnRight, btnCenter, btnJustify;
    private JToolBar miBarra;
}
