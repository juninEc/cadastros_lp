package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ProfessorModel {
  
    private String nome;
    private String email;
    private String cpf;
    private String matriculaProfessor;
    private String telefoneProfessor;
    private String grauAcademico;
    private String sexoProfessor;

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

    public String getMatriculaProfessor() {
        return matriculaProfessor;
    }

    public void setMatriculaProfessor(String matriculaProfessor) {
        this.matriculaProfessor = matriculaProfessor;
    }

    public String getTelefoneProfessor() {
        return telefoneProfessor;
    }

    public void setTelefoneProfessor(String telefoneProfessor) {
        this.telefoneProfessor = telefoneProfessor;
    }

    public String getGrauAcademico() {
        return grauAcademico;
    }

    public void setGrauAcademico(String grauAcademico) {
        this.grauAcademico = grauAcademico;
    }

    public String getSexoProfessor() {
        return sexoProfessor;
    }

    public void setSexoProfessor(String sexoProfessor) {
        this.sexoProfessor = sexoProfessor;
    }

    public String salvar() {

        try {
            FileWriter fw = new FileWriter("professores.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("\nInformações Professor(a):");
            pw.println("Nome: " + this.nome);
            pw.println("Email: " + this.email);
            pw.println("CPF: " + this.cpf);
            pw.println("Número de Matrícula: " + this.matriculaProfessor);
            pw.println("Telefone: " + this.telefoneProfessor);
            pw.println("Grau Acadêmico: " + this.grauAcademico);
            pw.println("Sexo: " + this.sexoProfessor);

            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Cadastrado com sucesso!";
    }

}
