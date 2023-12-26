package org.example.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {
    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }
}
