package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JTextField cajaTexto1;
    private JTextField cajaTexto2;
    private JTextField cajaTexto3;
    private JTextField cajaTexto4;    
    private JComboBox comboBox;

    //----------------------
    // Metodos
    //----------------------
    public PanelEntradaDatos()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar etiqueta Label 1
        label1 = new JLabel("Label 1: ");
        label1.setBounds(15,30,100,20);
        this.add(label1);

        //Crear y agregar etiqueta Label 2
        label2 = new JLabel("Label 2: ");
        label2.setBounds(15,60,100,20);
        this.add(label2);

        //Crear y agregar etiqueta Label 3
        label3 = new JLabel("Label 3: ");
        label3.setBounds(15,90,100,20);
        this.add(label3);

        //Crear y agregar etiqueta Label 4
        label4 = new JLabel("Label 4: ");
        label4.setBounds(15,120,100,20);
        this.add(label4);

        //Crear y agregar etiqueta Label 5
        label5 = new JLabel("Label 5: ");
        label5.setBounds(15,150,100,20);
        this.add(label5);

        // Crear y agregar la caja de texto del Label 2
        cajaTexto1 = new JTextField("Label 2");
        cajaTexto1.setBounds(90, 60, 260, 20);
        this.add(cajaTexto1);

        // Crear y agregar la caja de texto del Label 3
        cajaTexto2 = new JTextField("Label 3");
        cajaTexto2.setBounds(90, 90, 260, 20);
        this.add(cajaTexto2);

        // Crear y agregar la caja de texto del Label 4
        cajaTexto3 = new JTextField("Label 4");
        cajaTexto3.setBounds(90, 120, 260, 20);
        this.add(cajaTexto3);

        // Crear y agregar la caja de texto del Label 5
        cajaTexto4 = new JTextField("Label 5");
        cajaTexto4.setBounds(90, 150, 260, 20);
        this.add(cajaTexto4);       

        //Crear y agregar combo lista "combo box"
        comboBox = new JComboBox();
        comboBox.setBounds(90,30,260,20);
        this.add(comboBox);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }

    // Getters y Setters

    public JTextField getCajaTexto1() {
        return cajaTexto1;
    }

    public void setCajaTexto1(JTextField cajaTexto1) {
        this.cajaTexto1 = cajaTexto1;
    }

    public JTextField getCajaTexto2() {
        return cajaTexto2;
    }

    public void setCajaTexto2(JTextField cajaTexto2) {
        this.cajaTexto2 = cajaTexto2;
    }

    public JTextField getCajaTexto3() {
        return cajaTexto3;
    }

    public void setCajaTexto3(JTextField cajaTexto3) {
        this.cajaTexto3 = cajaTexto3;
    }

    public JTextField getCajaTexto4() {
        return cajaTexto4;
    }

    public void setCajaTexto4(JTextField cajaTexto4) {
        this.cajaTexto4 = cajaTexto4;
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

       

}