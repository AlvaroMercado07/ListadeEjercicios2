
package view;
import controller.ComboController;
import javax.swing.*;

public class MainView extends JFrame {
private JComboBox<String> cbComboBase;
    private JComboBox<String> cbBebida;
    private JComboBox<String> cbAcomp;
    private JComboBox<String> cbExtra;
    private JButton btnConfirmar;
    private ComboController controller;

    public MainView(ComboController controller) {
        this.controller = controller;
        setTitle("Pedido de Combo - MVP");
        setSize(360, 320);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initComponents() {
        JLabel lbl1 = new JLabel("Combo Base:");
        lbl1.setBounds(20,20,100,25); add(lbl1);
        cbComboBase = new JComboBox<>(new String[]{"Hamburguesa","Pollo","Vegetariano"});
        cbComboBase.setBounds(130,20,200,25); add(cbComboBase);

        JLabel lbl2 = new JLabel("Bebida:");
        lbl2.setBounds(20,60,100,25); add(lbl2);
        cbBebida = new JComboBox<>(new String[]{"Coca-Cola","Sprite","Agua"});
        cbBebida.setBounds(130,60,200,25); add(cbBebida);

        JLabel lbl3 = new JLabel("Acompañamiento:");
        lbl3.setBounds(20,100,120,25); add(lbl3);
        cbAcomp = new JComboBox<>(new String[]{"Papas","Ensalada","Nuggets"});
        cbAcomp.setBounds(140,100,190,25); add(cbAcomp);

        JLabel lbl4 = new JLabel("Extra:");
        lbl4.setBounds(20,140,100,25); add(lbl4);
        cbExtra = new JComboBox<>(new String[]{"Queso","Salsa","Helado"});
        cbExtra.setBounds(130,140,200,25); add(cbExtra);

        btnConfirmar = new JButton("Mostrar Resumen");
        btnConfirmar.setBounds(100,200,160,30); add(btnConfirmar);

        btnConfirmar.addActionListener(e -> controller.crearPedido(
            cbComboBase.getSelectedItem().toString(),
            cbBebida.getSelectedItem().toString(),
            cbAcomp.getSelectedItem().toString(),
            cbExtra.getSelectedItem().toString()
        ));
    }
}
