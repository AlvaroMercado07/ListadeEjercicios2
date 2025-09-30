
package controller;
import model.*;
import view.ResumenView;
public class ComboController {
  public void crearPedido(String tipoCombo, String bebida, String acompanamiento, String extra) {
        combo comboBase = ComboFactory.crearCombo(tipoCombo);
        if (comboBase == null) {
            new ResumenView("Tipo de combo invalido: " + tipoCombo);
            return;
        }

        ComboBuilder builder = new ComboBuilder(comboBase)
                .setBebida(bebida)
                .setAcompanamiento(acompanamiento)
                .setExtra(extra);

        Pedido pedido = builder.build();
        new ResumenView(pedido.getResumen());
    }   
}
