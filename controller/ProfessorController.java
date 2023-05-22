package controller;

import javax.swing.JOptionPane;

import model.ProfessorModel;


public class ProfessorController {
    private ProfessorModel professorModel;

    public ProfessorController() {
        this.professorModel = new ProfessorModel();
    }

    public void cadastrarProfessor(String nome, String email, String cpf, String matricula, String telefone, String grau,String sexo) {

        professorModel.setNome(nome); 
        professorModel.setEmail(email);
        professorModel.setCpf(cpf);
        professorModel.setMatriculaProfessor(matricula);
        professorModel.setTelefoneProfessor(telefone);
        professorModel.setGrauAcademico(grau);
        professorModel.setSexoProfessor(sexo);


        String mensagem = professorModel.salvar();

        JOptionPane.showMessageDialog(null, mensagem);
    }


}
