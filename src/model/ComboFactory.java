
package model;


public class ComboFactory {
     public static combo crearCombo(String tipo) {
        if (tipo == null) return null;
        switch (tipo.toLowerCase()) {
            case "hamburguesa": return new HamburguesaCombo();
            case "pollo": return new PolloCombo();
            case "vegetariano": return new VegetarianoCombo();
            default: return null;
        }
    }
}
