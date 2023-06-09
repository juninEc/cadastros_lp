package controller;

import javax.swing.JFrame;

import frame.FrameTela;
import frame.PanelCadastroAluno;
import frame.PanelCadastroDisciplina;
import frame.PanelCadastroProfessor;
import frame.PanelMenu;

/*singleton*/
public class FrameController {
    private static FrameController singleton = null;
    // atributos
    private static PanelCadastroAluno pCadAluno;
    private static PanelCadastroProfessor pCadProfessor;
    private static PanelCadastroDisciplina pCadDisciplina;
    private static PanelMenu pMenu;
    private static FrameTela frame;
    

    // contrutor privado
    private FrameController(){

    }
    
    public static FrameController getInstance(){
        if(singleton==null){
            singleton = new FrameController();
        }        
        return singleton;
    }
    // metodos
    public void init(){
        frame = new FrameTela();
        pMenu = new PanelMenu();
        pCadAluno = new PanelCadastroAluno();
        pCadProfessor = new PanelCadastroProfessor(); 
        pCadDisciplina = new PanelCadastroDisciplina(); 
    }

    public void mudarParaMenu(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(pMenu);
        frame.setTitle("Sistema de Cadastro UESB");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        frame.repaint();
        frame.validate();
       
    }
    public void mudarParaCadAluno(){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(pCadAluno);
        frame.setTitle("Cadastro do Aluno(a)");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        frame.repaint();
        frame.validate();
        
    }

    public void mudarParaCadProfessor() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(pCadProfessor);
        frame.setTitle("Cadastro do Professor(a)");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        frame.repaint();
        frame.validate();
       
    }

    public void mudarParaCadDisciplina() {
        frame.getContentPane().removeAll();
        frame.getContentPane().add(pCadDisciplina);
        frame.setTitle("Cadastro da Disciplina");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        frame.repaint();
        frame.validate();
       
    }
}
