
package model;


public class HamburguesaCombo extends combo {
    public HamburguesaCombo () {
        this.nombre= "combo hamburguesa";
    }
    @Override
    public String detalle () {
        return nombre;
    }
}
