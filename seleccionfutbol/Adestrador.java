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
public class Adestrador extends SeleccionFutbol  {
    private String idFederacion;

    public Adestrador() {
    }

    public Adestrador(String idFederacion, int id, String nome, String apelido, int edade) {
        super(id, nome, apelido, edade);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    public void dirixirPartido(){
        System.out.println("Dirigir Partido");
    }
    public void dirixirAdestramento(){
        System.out.println("Dirixir Adestramento");
    }
    @Override
    public void viaxar(){
        System.out.println("Viaxar os adestradores");
    }
    @Override
    public String toString() {
        return super.toString()+", idFederacion=" + idFederacion;
    }
    
    
}
