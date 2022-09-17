/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author christhofer.vieira
 */
public class Jogo extends item {
    private int memoria;
    private String tipo;

    /**
     * @return the memoria
     */
    public int getMemoria() {
        return memoria;
    }

    /**
     * @param memoria the memoria to set
     */
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
        
    }
     public Jogo (Categoria categoria){
            super(categoria);
    }   
}
