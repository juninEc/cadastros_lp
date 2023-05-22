package controller;

import javax.swing.JOptionPane;

import model.DisciplinaModel;

public class DisciplinaController {
    private DisciplinaModel disciplinaModel; 

    public DisciplinaController(){
        this.disciplinaModel = new DisciplinaModel();
    }

    public void cadastrarDisciplina(String nome, String cargaHoraria, String matricula, String departamento) {
        disciplinaModel.setNome(nome);
        disciplinaModel.setCargaHoraria(cargaHoraria);
        disciplinaModel.setMatriculaDisciplina(matricula);
        disciplinaModel.setDepartamento(departamento);

        String mensagem = disciplinaModel.salvar();

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
