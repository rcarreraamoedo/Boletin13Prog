/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionfutbol;

/**
 *
 * @author rcarreraamoedo
 */
public class Xogador extends SeleccionFutbol {
    private int dorsal;
    private String demarcacion;

    public Xogador() {
        super();
    }
    public Xogador(int dorsal, String demarcacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    public void xogarPartido(){
        System.out.println("Xogar Partido");
    }
    public void entrenar(){
        System.out.println("Entrenar antes del Partido");
    }
    @Override
    public void viaxar(){
        System.out.println("Viaxan os Xogadores");
    }

    @Override
    public String toString() {
        return super.toString()+", dorsal=" + dorsal + ", demarcacion=" + demarcacion;
    }
    
    
}
