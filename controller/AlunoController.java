package controller;

import javax.swing.JOptionPane;

import model.AlunoModel;

public class AlunoController {
    private AlunoModel alunoModel;

    public AlunoController() {
        this.alunoModel = new AlunoModel();
    }

    public void cadastrarAluno(String nome, String email, String cpf, String matricula, String telefone, String sexo) {
        alunoModel.setNome(nome);
        alunoModel.setEmail(email);
        alunoModel.setCpf(cpf);
        alunoModel.setMatriculaAluno(matricula);
        alunoModel.setTelefoneAluno(telefone);
        alunoModel.setSexoAluno(sexo);

        String mensagem = alunoModel.salvar();

        JOptionPane.showMessageDialog(null, mensagem);
    }

}
