
package model;


public class PolloCombo extends combo {
    public PolloCombo() {
        this.nombre="Combo Pollo";
    }
    @Override
    public String detalle(){
        return nombre;
    }
}
