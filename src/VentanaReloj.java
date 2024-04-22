import javax.swing.*;
import java.awt.*;

public class VentanaReloj extends JPanel{
    private JPanel PanelPrincipal;
    private JPanel PanelSur, PanelNorte, PanelCentro;
    private JButton Start;
    private JButton Stop;
    private RelojAntonio miReloj;
    private JLabel title;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public VentanaReloj(){
        setLayout(new BorderLayout());
        PanelSur=new JPanel();
        PanelSur.setLayout(new FlowLayout());
        Start=new JButton("Start");
        Stop=new JButton("Stop");
        PanelSur.add(Start);
        PanelSur.add(Stop);
        PanelNorte=new JPanel();
        PanelNorte.setLayout(new FlowLayout());
        title=new JLabel("Ventana Reloj");
        PanelNorte.add(title);
        add(PanelNorte,BorderLayout.NORTH);
        add(PanelSur,BorderLayout.SOUTH);
        miReloj=new RelojAntonio();
        miReloj.setHoraAlarma(3);
        miReloj.setMinutoAlarma(26);
        // miReloj.setAlarma(false);

        PanelCentro=new JPanel(new FlowLayout(FlowLayout.CENTER,1,150));
        PanelCentro.add(miReloj);

        add(PanelCentro,BorderLayout.CENTER);

        Start.addActionListener(e->{
            miReloj.IniciarReloj();
        });

        Stop.addActionListener(e->{
            miReloj.PararReloj();
        });


    }





}



