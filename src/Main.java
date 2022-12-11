import ProcesoGUI.Procesos;
import Ventana.WindowMain;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Procesos misProcesos = new Procesos();

        JFrame frame = new JFrame("Notas Finales");
        frame.setContentPane(new WindowMain().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}