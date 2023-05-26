package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;

public class PanelOperaciones extends JPanel
{
    //----------------------
    // Atributos
    //----------------------
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;

    private JButton btAceptar;
    private JButton btSalir;

    //----------------------
    // Metodos
    //----------------------

    //Constructor
    public PanelOperaciones()
    {
        //Definición del contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.WHITE);

        //Crear y agregar botón 1
        bt1 = new JButton("Botón 1");
        bt1.setBounds(10,20,170,20);
        bt1.setActionCommand("agregarVendedor");
        this.add(bt1);

        //Crear y agregar botón 2
        bt2 = new JButton("Botón 2");
        bt2.setBounds(10,50,170,20);
        bt2.setActionCommand("calcularSueldo");
        this.add(bt2);

        //Crear y agregar el botón 3
        bt3 = new JButton("Botón 3");
        bt3.setBounds(190,20,170,20); 
        bt3.setActionCommand("liquidarNomina");
        this.add(bt3);

        // Crear y agregar el botón 4
        bt4 = new JButton("Botón 4");
        bt4.setBounds(190,50,170,20);
        bt4.setActionCommand("agregarModeloCarro");
        this.add(bt4);

        // Crear y agregar el botón TotalidadVentas
        btAceptar = new JButton("Aceptar");
        btAceptar.setBounds(10,80,170,20);
        btAceptar.setActionCommand("totalidadVentas");
        this.add(btAceptar);

        //Crear y agregar botón Salir
        btSalir = new JButton("Salir");
        btSalir.setBounds(190,80,170,20); 
        btSalir.setActionCommand("Salir");
        this.add(btSalir);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
        borde.setTitleColor(Color.BLUE);
        this.setBorder(borde);
    }


    // Detecta cuando se realiza alguna acción
    public void agregarOyentesBotones(ActionListener pAL)
    {
        bt1.addActionListener(pAL);
        bt2.addActionListener(pAL);
        bt3.addActionListener(pAL);
        bt4.addActionListener(pAL);
        btAceptar.addActionListener(pAL);
        btSalir.addActionListener(pAL);
    }

}