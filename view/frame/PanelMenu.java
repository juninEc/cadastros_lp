package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import controller.FrameController;

public class PanelMenu extends JPanel {

    private JLabel labelTitulo;
    private JButton buttonAluno;
    private JButton buttonProfessor;
    private JButton buttonDisciplina;

    public PanelMenu() {
        super();
        this.setLayout(null);
        setBackground(Color.decode("#B74B4B"));

        initLabelTitulo();
        initButtonAluno();
        initButtonProfessor();
        initButtonDisciplina();
    }

    public void initLabelTitulo() {
        labelTitulo = new JLabel("Seja bem-vindo(a)!");
        labelTitulo.setBounds(40, 25, 200, 20);
        labelTitulo.setForeground(Color.WHITE);
        add(labelTitulo);
    }

    public void initButtonAluno() {
        buttonAluno = new JButton("Cadastrar Aluno");
        buttonAluno.setBounds(380, 100, 220, 40);
        buttonAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameController.getInstance().mudarParaCadAluno();
            }
        });

        add(buttonAluno);
    }

    public void initButtonProfessor() {
        buttonProfessor = new JButton("Cadastrar Professor(a)");
        buttonProfessor.setBounds(380, 200, 220, 40);
        buttonProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FrameController.getInstance().mudarParaCadProfessor();
            }
        });

        add(buttonProfessor);
    }

    public void initButtonDisciplina() {
        buttonDisciplina = new JButton("Cadastrar Disciplina");
        buttonDisciplina.setBounds(380, 300, 220, 40);
        buttonDisciplina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Cadastrar Disciplina");
            }
        });

        add(buttonDisciplina);
    }
}
