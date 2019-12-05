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
public class Masaxista extends SeleccionFutbol {
    private String titulacion;
    private int anosExperiencia;

    public Masaxista() {
    }

    public Masaxista(String titulacion, int anosExperiencia, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }
    
    public void darMasaxe(){
        System.out.println("Dar masaxe");
    }
    @Override
    public void viaxar(){
        System.out.println("viaxan os masaxistas");
    }

    @Override
    public String toString() {
        return super.toString()+", titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia;
    }
    
    
}
