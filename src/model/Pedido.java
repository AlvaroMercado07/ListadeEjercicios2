
package model;


public class Pedido {
     private combo comboBase;
    private String bebida;
    private String acompanamiento;
    private String extra;
    public Pedido(combo comboBase, String bebida, String acompanamiento, String extra) {
        this.comboBase = comboBase;
        this.bebida = bebida;
        this.acompanamiento = acompanamiento;
        this.extra = extra;
    }
    public String getResumen() {
        StringBuilder sb = new StringBuilder();
        sb.append("Combo base: ").append(comboBase == null ? "-" : comboBase.getNombre()).append("\n");
        sb.append("Bebida: ").append(bebida == null ? "-" : bebida).append("\n");
        sb.append("Acompañamiento: ").append(acompanamiento == null ? "-" : acompanamiento).append("\n");
        sb.append("Extra: ").append(extra == null ? "-" : extra).append("\n");
        return sb.toString();
    }
}
