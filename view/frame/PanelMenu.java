package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelMenu extends JPanel {

    static PanelMenu pMenu;
    static PanelCadastroAluno pAluno;
    static FrameTela frame;
    private JLabel labelTitulo;
    private JButton buttonAluno;
    private JButton buttonProfessor;
    private JButton buttonDisciplina;
    boolean fechou;

    public PanelMenu() {
        super();
        this.setLayout(null);
        setBackground(Color.decode("#B74B4B"));

        pMenu = this;

        add(getLabelTitulo());
        add(getButtonAluno());
        add(getButtonProfessor());
        add(getButtonDisciplina());

        ControladorFrame controlador = new ControladorFrame();
        getButtonAluno().addActionListener(controlador);
        getButtonProfessor().addActionListener(controlador);
        getButtonDisciplina().addActionListener(controlador);

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

    static class ControladorFrame implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == pMenu.getButtonAluno()) {
                JOptionPane.showMessageDialog(null, "Cadastrar Disciplina");
            } else if (e.getSource() == pMenu.getButtonProfessor()) {
                JOptionPane.showMessageDialog(null, "Cadastrar Professor");
            } else if (e.getSource() == pMenu.getButtonDisciplina()) {
                JOptionPane.showMessageDialog(null, "Cadastrar Disciplina");
            }
        }
    }
}
