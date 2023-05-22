package model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class DisciplinaModel {
    private String nome;
    private String cargaHoraria;
    private String matriculaDisciplina;
    private String departamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getMatriculaDisciplina() {
        return matriculaDisciplina;
    }

    public void setMatriculaDisciplina(String matriculaDisciplina) {
        this.matriculaDisciplina = matriculaDisciplina;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String salvar() {

        try {
            FileWriter fw = new FileWriter("disciplina.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("\nInformações da Disciplina:");
            pw.println("Nome: " + this.nome);
            pw.println("Carga Horária: " + this.cargaHoraria + "h");
            pw.println("Número de Matrícula: " + this.matriculaDisciplina);
            pw.println("Departameno: " + this.departamento);
            pw.flush();
            pw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Cadastrado com sucesso!";
    }
}
