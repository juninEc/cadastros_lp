package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AlunoModel {
    private String nome;
    private String email;
    private String cpf;
    private String matriculaAluno;
    private String telefoneAluno;
    private String sexoAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefone) {
        this.telefoneAluno = telefone;
    }

    public String getSexoAluno() {
        return sexoAluno;
    }

    public void setSexoAluno(String sexoAluno) {
        this.sexoAluno = sexoAluno;
    }

    public String salvar() {

        try {
            FileWriter fw = new FileWriter("alunos.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("\nInformações Aluno:");
            pw.println("Nome: " + this.nome);
            pw.println("Email: " + this.email);
            pw.println("CPF: " + this.cpf);
            pw.println("Número de Matrícula: " + this.matriculaAluno);
            pw.println("Telefone: " + this.telefoneAluno);
            pw.println("Sexo: " + this.sexoAluno);

            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Cadastrado com sucesso!";
    }
}
