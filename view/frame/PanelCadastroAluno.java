package frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import controller.AlunoController;

public class PanelCadastroAluno extends JFrame {
    private JTextField nome;
    private JTextField email;
    private JTextField cpf;
    private JTextField num_matricula;
    private JFormattedTextField telefone;
    private JComboBox<String> sexo;

    private JLabel labelNome;
    private JLabel labelCpf;
    private JLabel labelNum_Matricula;
    private JLabel labelTelefone;
    private JLabel labelSexo;
    private JLabel labelEmail;
    private JLabel labelTitulo;
    private JLabel labelImg;

    private JButton botaoCadastrar;

    public PanelCadastroAluno() {

        JFrame frame = new JFrame("Cadastro do Aluno");
        JPanel painel = new JPanel();

        painel.add(getLabelTitulo());
        painel.add(getLabelNome());
        painel.add(getNome());
        painel.add(getLabelEmail());
        painel.add(getEmail());
        painel.add(getLabelCpf());
        painel.add(getCpf());
        painel.add(getLabelNum_Matricula());
        painel.add(getNum_matricula());
        painel.add(getLabelTelefone());
        painel.add(getTelefone());
        painel.add(getLabelSexo());
        painel.add(getSexo());
        painel.add(getBotaoCadastrar());
       // painel.add(getLabelImg());

        // Definições da tela
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
            labelImg.setIcon(new ImageIcon(PanelCadastroAluno.class.getResource("/img/fundo.jpg")));
            labelImg.setBounds(0, 0, 684, 461);
        }

        return labelImg;
    }
*/
    public JLabel getLabelTitulo() {
        if (labelTitulo == null) {
            labelTitulo = new JLabel("Seja bem-vindo(a)!");
            labelTitulo.setBounds(40, 25, 200, 20);
            labelTitulo.setForeground(Color.WHITE);
        }
        return labelTitulo;
    }

    public JLabel getLabelNome() {
        if (labelNome == null) {
            labelNome = new JLabel("Nome: ");
            labelNome.setBounds(370, 25, 200, 20);
            labelNome.setForeground(Color.WHITE);
        }
        return labelNome;
    }

    public JTextField getNome() {
        if (nome == null) {
            nome = new JTextField();
            nome.setBorder(new LineBorder(Color.WHITE));
            nome.setBounds(370, 50, 250, 20);
            nome.setColumns(20);

        }
        return nome;
    }

    public JLabel getLabelEmail() {
        if (labelEmail == null) {
            labelEmail = new JLabel("Email: ");
            labelEmail.setBounds(370, 75, 200, 20);
            labelEmail.setForeground(Color.WHITE);
        }
        return labelEmail;
    }

    public JTextField getEmail() {
        if (email == null) {
            email = new JTextField();
            email.setBorder(new LineBorder(Color.WHITE));
            email.setBounds(370, 100, 250, 20);
            email.setColumns(20);

        }
        return email;
    }

    public JLabel getLabelCpf() {
        if (labelCpf == null) {
            labelCpf = new JLabel("CPF: ");
            labelCpf.setBounds(370, 125, 200, 20);
            labelCpf.setForeground(Color.WHITE);
        }
        return labelCpf;
    }

    public JTextField getCpf() {
        if (cpf == null) {
            try {
                cpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            cpf.setBorder(new LineBorder(Color.WHITE));
            cpf.setBounds(370, 150, 250, 20);
            cpf.setColumns(20);

        }
        return cpf;
    }

    public JLabel getLabelNum_Matricula() {
        if (labelNum_Matricula == null) {
            labelNum_Matricula = new JLabel("Número de Matrícula: ");
            labelNum_Matricula.setBounds(370, 175, 200, 20);
            labelNum_Matricula.setForeground(Color.WHITE);
        }
        return labelNum_Matricula;
    }

    public JTextField getNum_matricula() {
        if (num_matricula == null) {
            try {
                num_matricula = new JFormattedTextField(new MaskFormatter("#########"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            num_matricula.setBorder(new LineBorder(Color.WHITE));
            num_matricula.setBounds(370, 200, 250, 20);
            num_matricula.setColumns(20);
        }
        return num_matricula;
    }

    public JLabel getLabelTelefone() {
        if (labelTelefone == null) {
            labelTelefone = new JLabel("Telefone:");
            labelTelefone.setBounds(370, 225, 200, 20);
            labelTelefone.setForeground(Color.WHITE);
        }
        return labelTelefone;
    }

    public JTextField getTelefone() {

        if (telefone == null) {
            try {
                telefone = new JFormattedTextField(new MaskFormatter("## ##### - ####"));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            telefone.setBorder(new LineBorder(Color.WHITE));
            telefone.setBounds(370, 250, 200, 20);
            telefone.setColumns(20);
        }
        return telefone;
    }

    public JLabel getLabelSexo() {
        if (labelSexo == null) {
            labelSexo = new JLabel("Sexo: ");
            labelSexo.setBounds(370, 275, 200, 20);
            labelSexo.setForeground(Color.WHITE);
        }
        return labelSexo;
    }

    public JComboBox<String> getSexo() {
        if (sexo == null) {
            sexo = new JComboBox<>(new String[] { " ", "Masculino", "Feminino", "Outro" });

            sexo.setBounds(370, 300, 250, 20);
        }
        return sexo;
    }

    public JButton getBotaoCadastrar() {
        if (botaoCadastrar == null) {
            botaoCadastrar = new JButton("Cadastrar");
            botaoCadastrar.setBounds(440, 360, 100, 40);
        }

        botaoCadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                AlunoController controller = new AlunoController();

                final String nomeStr = nome.getText();
                String emailStr = email.getText();
                String cpfStr = cpf.getText();
                String matricula = num_matricula.getText();
                String telefoneStr = telefone.getText();
                String sexoStr = (String) sexo.getSelectedItem();

                controller.cadastrarAluno(nomeStr, emailStr, cpfStr, matricula, telefoneStr, sexoStr);

                getNome().setText("");
                getEmail().setText("");
                getCpf().setText("");
                getNum_matricula().setText("");
                getTelefone().setText("");
                getSexo().setSelectedIndex(0);

            }
        });

        return botaoCadastrar;
    }
}