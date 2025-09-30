
package view;
import javax.swing.*;

public class ResumenView extends JFrame {
        public ResumenView(String resumen) {
        setTitle("Resumen del Pedido");
        setSize(320,220);
        JTextArea txt = new JTextArea(resumen);
        txt.setEditable(false);
        add(new JScrollPane(txt));
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
