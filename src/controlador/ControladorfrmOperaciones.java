
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
        
        this.vista.btnSumar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                modelo.setOperador1(Integer.parseInt(vista.txtOperador1.getText()));
                modelo.setOperador2(Integer.parseInt(vista.txtOperador2.getText()));
                modelo.sumar();
                vista.lblResultado.setText(String.valueOf(modelo.getCalculo()));
                
            }
        });
        
        this.vista.btnLimpiar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.txtOperador1.setText("");
                vista.txtOperador2.setText("");
                vista.lblResultado.setText("");
                
            }
        });
        
       
    }
    
    
    
    public void iniciar(){
        this.vista.setVisible(true);
    }
    
}
