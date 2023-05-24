package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import controller.AlunoController;
import controller.FrameController;

public class PanelCadastroAluno extends JPanel {
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
 private JLabel labelInfo;   private JLabel labelTitulo;
    
    private JButton botaoCadastrar;
    private JButton botaoVoltar;

    public PanelCadastroAluno() {
        super();
        this.setLayout(null);
        setBackground(Color.decode("#B74B4B"));

        initLabelTitulo();
        initLabelInfo();
        initLabelNome();
        initNome();
        initLabelEmail();
        initEmail();
        initLabelCpf();
        initCpf();
        initLabelNum_Matricula();
        initNum_matricula();
        initLabelTelefone();
        initTelefone();
        initLabelSexo();
        initSexo();
        initBotaoCadastrar();
        initBotaoVoltar();
    }

    public void initLabelTitulo() {
        labelTitulo = new JLabel("Seja bem-vindo(a)!");
        labelTitulo.setBounds(40, 25, 200, 20);
        labelTitulo.setForeground(Color.WHITE);
        Font font = labelTitulo.getFont();
        Font novaFonte = new Font(font.getName(), Font.BOLD, 18);
        labelTitulo.setFont(novaFonte);
        add(labelTitulo);
    }

    public void initLabelInfo() {
        labelInfo = new JLabel("<html>Área destinada para o cadastro de alunos da instituição!</html>");
        labelInfo.setBounds(40, 35, 200, 100);
        labelInfo.setForeground(Color.WHITE);
        add(labelInfo);
    }

    public void initLabelNome() {
        labelNome = new JLabel("Nome: ");
        labelNome.setBounds(370, 25, 200, 20);
        labelNome.setForeground(Color.WHITE);
        add(labelNome);
    }

    public void initNome() {
        nome = new JTextField();
        nome.setBorder(new LineBorder(Color.WHITE));
        nome.setBounds(370, 50, 250, 20);
        nome.setColumns(20);
        add(nome);
    }

    public void initLabelEmail() {
        labelEmail = new JLabel("Email: ");
        labelEmail.setBounds(370, 75, 200, 20);
        labelEmail.setForeground(Color.WHITE);
        add(labelEmail);
    }

    public void initEmail() {
        email = new JTextField();
        email.setBorder(new LineBorder(Color.WHITE));
        email.setBounds(370, 100, 250, 20);
        email.setColumns(20);
        add(email);
    }

    public void initLabelCpf() {
        labelCpf = new JLabel("CPF: ");
        labelCpf.setBounds(370, 125, 200, 20);
        labelCpf.setForeground(Color.WHITE);
        add(labelCpf);
    }

    public void initCpf() {
        try {
            cpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        cpf.setBorder(new LineBorder(Color.WHITE));
        cpf.setBounds(370, 150, 250, 20);
        cpf.setColumns(20);
        add(cpf);
    }

    public void initLabelNum_Matricula() {
        labelNum_Matricula = new JLabel("Número de Matrícula: ");
        labelNum_Matricula.setBounds(370, 175, 200, 20);
        labelNum_Matricula.setForeground(Color.WHITE);
        add(labelNum_Matricula);
    }

    public void initNum_matricula() {
        try {
            num_matricula = new JFormattedTextField(new MaskFormatter("#########"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        num_matricula.setBorder(new LineBorder(Color.WHITE));
        num_matricula.setBounds(370, 200, 250, 20);
        num_matricula.setColumns(20);
        add(num_matricula);
    }

    public void initLabelTelefone() {
        labelTelefone = new JLabel("Telefone:");
        labelTelefone.setBounds(370, 225, 200, 20);
        labelTelefone.setForeground(Color.WHITE);
        add(labelTelefone);
    }

    public void initTelefone() {
        try {
            telefone = new JFormattedTextField(new MaskFormatter("## ##### - ####"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        telefone.setBorder(new LineBorder(Color.WHITE));
        telefone.setBounds(370, 250, 200, 20);
        telefone.setColumns(20);
        add(telefone);
    }

    public void initLabelSexo() {
        labelSexo = new JLabel("Sexo: ");
        labelSexo.setBounds(370, 275, 200, 20);
        labelSexo.setForeground(Color.WHITE);
        add(labelSexo);
    }

    public void initSexo() {
        sexo = new JComboBox<>(new String[] { " ", "Masculino", "Feminino", "Outro" });
        sexo.setBounds(370, 300, 250, 20);
        add(sexo);
    }

    public void initBotaoCadastrar() {

        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(440, 360, 100, 40);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlunoController controller = new AlunoController();

                String nomeStr = nome.getText();
                String emailStr = email.getText();
                String cpfStr = cpf.getText();
                String matricula = num_matricula.getText();
                String telefoneStr = telefone.getText();
                String sexoStr = (String) sexo.getSelectedItem();

                if (nomeStr.isEmpty() || emailStr.isEmpty() || cpfStr.isEmpty() || matricula.isEmpty()
                        || telefoneStr.isEmpty() || sexoStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                } else {
                    controller.cadastrarAluno(nomeStr, emailStr, cpfStr, matricula, telefoneStr, sexoStr);

                    nome.setText("");
                    email.setText("");
                    cpf.setText("");
                    num_matricula.setText("");
                    telefone.setText("");
                    sexo.setSelectedIndex(0);

                    FrameController.getInstance().mudarParaMenu();
                }
            }
        });

        add(botaoCadastrar);
    }
    public void initBotaoVoltar() {
        botaoVoltar = new JButton("Voltar");
        botaoVoltar.setBounds(20, 400, 80, 20);

        botaoVoltar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                FrameController.getInstance().mudarParaMenu();
            }
        });

        add(botaoVoltar);
    }
}