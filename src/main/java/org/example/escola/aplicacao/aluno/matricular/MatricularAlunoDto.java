package org.example.escola.aplicacao.aluno.matricular;

import org.example.escola.dominio.aluno.Aluno;
import org.example.escola.dominio.aluno.CPF;
import org.example.escola.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String nomeAluno;
    private String cpfAluno;
    private String emailAluno;

    public MatricularAlunoDto(String nomeAluno, String cpfAluno, String emailAluno) {
        this.nomeAluno = nomeAluno;
        this.cpfAluno = cpfAluno;
        this.emailAluno = emailAluno;
    }

    public Aluno criarAluno() {
        return new Aluno(new CPF(cpfAluno),
                nomeAluno,
                new Email(emailAluno));
    }
}
