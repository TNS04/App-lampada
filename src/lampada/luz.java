/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampada;

/**
 *
 * @author Társis
 */
public class luz {
    private boolean estado;
    public luz(){
        estado = false;
    }
    
    public String getEstado(){
        if(estado){
            return "ACESA";
        }
        else{
            return "APAGADA";
        }
    }
    
    public void mudarEstado(){
        this.estado = !this.estado;
    }
}