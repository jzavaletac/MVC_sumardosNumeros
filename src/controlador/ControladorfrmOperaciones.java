
package controlador;

import java.awt.event.*;
import modelo.OperacionMatematica;
import vista.frmOperaciones;

public class ControladorfrmOperaciones {
    
    private modelo.OperacionMatematica modelo;
    private frmOperaciones vista;
    
    public ControladorfrmOperaciones( OperacionMatematica modelo , frmOperaciones vista ){
        this.vista = vista;
        this.modelo = modelo;
        
        this.vista
        
    }
    
    public void iniciar(){
        this.vista.setVisible(true);
    }
    
}
