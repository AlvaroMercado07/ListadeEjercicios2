
package model;


public class VegetarianoCombo extends combo {
    public VegetarianoCombo() {
        this.nombre = "Combo Vegetariano";
    }
     @Override
    public String detalle() {
        return nombre;
    }
}
