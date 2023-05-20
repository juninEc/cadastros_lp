package frame;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import controller.FrameController;

public class PanelMenu extends JPanel {
    FrameController frame; 
    private JLabel labelTitulo;
    private JButton buttonAluno;
    private JButton buttonProfessor;
    private JButton buttonDisciplina;

    public PanelMenu() {
        super();
        this.setLayout(null);

        add(getLabelTitulo());
        add(getButtonAluno());
        add(getButtonProfessor());
        add(getButtonDisciplina());

    }

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
