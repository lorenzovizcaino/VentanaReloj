import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal(){
        setBounds(100,100,500,500);
        setTitle("Reloj");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaReloj ventanaReloj=new VentanaReloj();
        add(ventanaReloj);
        setVisible(true);
    }
}
