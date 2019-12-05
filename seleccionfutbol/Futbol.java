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
public class Futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Xogador obx1 = new Xogador(32,"Defensa",1,"Pedro","Pérez",22);
        System.out.println(obx1.toString());
        obx1.concentrarse();
        obx1.viaxar();
        obx1.concentrarse();
        
        Adestrador obx2 = new Adestrador("Española",1,"Roberto","Moreno",47);
        System.out.println(obx2.toString());
        obx2.concentrarse();
        
        Masaxista obx3 = new Masaxista("Fisioterapeuta",15,1,"Manolo","Rodriguez",45);
        System.out.println(obx3.toString());
        obx3.concentrarse();
        obx3.darMasaxe();
    }
    
}
