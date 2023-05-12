package controlador;

import java.awt.event.ActionListener;

import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{

    //------------------
    //Atributos
    //------------------
    private VentanaPrincipal venPrin;

    //------------------
    //Metodos
    //------------------

    //Constructor
    public Controlador(VentanaPrincipal pVenPrin){

        this.venPrin = pVenPrin;

        this.venPrin.miPanelOperaciones.agregarOyentesBotones(this);
        this.venPrin.miPanelResultados.mostrarResultado("App lista para usar... \nSe han creado los siguientes tipos de objetos: \nVentanaPrincipal\nClase1\nControlador");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String comando = ae.getActionCommand();

        //Salir
        if(comando.equals("Salir"))
        {
            System.exit(0);
        }  
    }
    

}
