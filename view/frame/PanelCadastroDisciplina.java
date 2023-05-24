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

import controller.DisciplinaController;
import controller.FrameController;

public class PanelCadastroDisciplina extends JPanel {
    private JTextField nome;
    private JTextField cargaHoraria;
    private JTextField num_matricula;
    private JComboBox<String> departamento;

    private JLabel labelTitulo;
    private JLabel labelInfo;
    private JLabel labelNome;
    private JLabel labelCargaHoraria;
    private JLabel labelNum_Matricula;
    private JLabel labelDepartamento;

    private JButton botaoCadastrar;
    private JButton botaoVoltar;

    public PanelCadastroDisciplina() {
        super();
        this.setLayout(null);
        setBackground(Color.decode("#B74B4B"));

        initLabelTitulo();
        initLabelInfo();
        initLabelNome();
        initNome();
        initLabelCargaHoraria();
        initCargaHoraria();
        initLabelNum_Matricula();
        initNum_matricula();
        initLabelDepartamento();
        initDepartamento();
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
        labelInfo = new JLabel("<html>Área destinada para o cadastro de disciplinas da instituição!</html>");
        labelInfo.setBounds(40, 35, 200, 100);
        labelInfo.setForeground(Color.WHITE);
        add(labelInfo);
    }

    public void initLabelNome() {
        labelNome = new JLabel("Nome:");
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

    public void initLabelCargaHoraria() {
        labelCargaHoraria = new JLabel("Carga Horária:");
        labelCargaHoraria.setBounds(370, 75, 200, 20);
        labelCargaHoraria.setForeground(Color.WHITE);
        add(labelCargaHoraria);
    }

    public void initCargaHoraria() {
        cargaHoraria = new JTextField();
        cargaHoraria.setBorder(new LineBorder(Color.WHITE));
        cargaHoraria.setBounds(370, 100, 250, 20);
        cargaHoraria.setColumns(20);
        add(cargaHoraria);
    }

    public void initLabelNum_Matricula() {
        labelNum_Matricula = new JLabel("Número de Matrícula: ");
        labelNum_Matricula.setBounds(370, 125, 200, 20);
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
        num_matricula.setBounds(370, 150, 250, 20);
        num_matricula.setColumns(20);
        add(num_matricula);
    }

    public void initLabelDepartamento() {
        labelDepartamento = new JLabel("Departamento: ");
        labelDepartamento.setBounds(370, 175, 200, 20);
        labelDepartamento.setForeground(Color.WHITE);
        add(labelDepartamento);
    }

   
    public void initDepartamento() {
        departamento = new JComboBox<>(new String[] { " ", "DCB", "DCHL", "DCT", "DS I", "DS II" });
        departamento.setBounds(370, 200, 250, 20);
        add(departamento);
    }

    public void initBotaoCadastrar() {
        botaoCadastrar = new JButton("Cadastrar");
        botaoCadastrar.setBounds(440, 240, 100, 40);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override 
            public void actionPerformed(ActionEvent e){
                DisciplinaController controller = new DisciplinaController(); 

                String nomeStr = nome.getText();
                String cargaHorariaStr = cargaHoraria.getText();
                String matricula = num_matricula.getText();
                String departamentoStr = (String) departamento.getSelectedItem();

                if (nomeStr.isEmpty() || cargaHorariaStr.isEmpty() ||  matricula.isEmpty()
                        || departamentoStr.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
                        }else{
                            controller.cadastrarDisciplina(nomeStr, cargaHorariaStr, matricula, departamentoStr);

                            nome.setText("");
                            cargaHoraria.setText("");
                            num_matricula.setText("");
                            departamento.setSelectedIndex(0); 
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
