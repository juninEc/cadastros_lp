package frame;

import javax.swing.JFrame;

public class FrameTela extends JFrame {
    
    public FrameTela() {
       
        setTitle("Sistema de Cadastro UESB");
       // frame.getContentPane().add(painelMenu);
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        repaint();
        validate();
    }

}
