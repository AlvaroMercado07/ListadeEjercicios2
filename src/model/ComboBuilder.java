
package model;

public class ComboBuilder {
    
    private combo comboBase;
    private String bebida;
    private String acompanamiento;
    private String extra;
     public ComboBuilder(combo comboBase) {
        this.comboBase = comboBase;
    }

    public ComboBuilder setBebida(String bebida) {
        this.bebida = bebida;
        return this;
    }

    public ComboBuilder setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
        return this;
    }

    public ComboBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public Pedido build() {
        return new Pedido(comboBase, bebida, acompanamiento, extra);
    }
}
