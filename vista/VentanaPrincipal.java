package vista;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{

    //----------------------
    // Atributos
    //----------------------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //----------------------
    // Metodos
    //----------------------

    // Constructor
    public VentanaPrincipal(){

        // Creación de colores mediante RGV para los páneles:
        Color color1=new Color(100, 227, 144);        

        // 
        this.setLayout(null);

        //Creación y adición del PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,370,190);
        miPanelEntradaDatos.setBackground(color1);
        this.add(miPanelEntradaDatos);
        

        //Creación y adición del PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,220,370,120);
        miPanelOperaciones.setBackground(color1);
        this.add(miPanelOperaciones);

        //Creación y adición del PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,350,370,190);
        miPanelResultados.setBackground(color1);
        this.add(miPanelResultados);

        //Caracteristicas de la ventana
        this.setTitle("Plantilla Base");
        this.setSize(410,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);

    }    

}