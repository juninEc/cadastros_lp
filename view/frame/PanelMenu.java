package frame;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PanelMenu extends JFrame {
    private JLabel labelTitulo;
    private JLabel labelImg;

    private JButton buttonAluno;
    private JButton buttonProfessor;
    private JButton buttonDisciplina;

    public PanelMenu() {

        JFrame frame = new JFrame("Menu");
        JPanel painel = new JPanel();

        painel.add(getLabelTitulo());
        painel.add(getButtonAluno());
        painel.add(getButtonProfessor());
        painel.add(getButtonDisciplina());
     //   painel.add(getLabelImg());

        painel.setLayout(null);
        frame.getContentPane().add(painel);
        frame.setSize(700, 500);
        setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
/* 
    public JLabel getLabelImg() {
        if (labelImg == null) {
            labelImg = new JLabel();
            labelImg.setIcon(new ImageIcon(PanelMenu.class.getResource("cadastros_lp/view/frame/img/fundo.jpg")));
            labelImg.setBounds(0, 0, 700, 500);
            
        }
        return labelImg;
    }*/

    public JLabel getLabelTitulo() {
        if (labelTitulo == null) {
            labelTitulo = new JLabel("Seja bem-vindo(a)!");
            labelTitulo.setBounds(40, 25, 200, 20);
            labelTitulo.setForeground(Color.WHITE);
        }
        return labelTitulo;
    }

    public JButton getButtonAluno() {
        if (buttonAluno == null) {
            buttonAluno = new JButton("Cadastrar Aluno");
            buttonAluno.setBounds(380, 100, 220, 40);
        }

        buttonAluno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                PanelCadastroAluno panelCadastroAluno = new PanelCadastroAluno();
                panelCadastroAluno.setVisible(true);
                Window window = SwingUtilities.getWindowAncestor(buttonAluno);
                window.dispose(); 
            }
        });
        

        return buttonAluno;
    }

    public JButton getButtonProfessor() {
        if (buttonProfessor == null) {
            buttonProfessor = new JButton("Cadastrar Professor(a)");
            buttonProfessor.setBounds(380, 200, 220, 40);
        }

        return buttonProfessor;
    }

    public JButton getButtonDisciplina() {
        if (buttonDisciplina == null) {
            buttonDisciplina = new JButton("Cadastrar Disciplina");
            buttonDisciplina.setBounds(380, 300, 220, 40);
        }

        return buttonDisciplina;
    }

}
