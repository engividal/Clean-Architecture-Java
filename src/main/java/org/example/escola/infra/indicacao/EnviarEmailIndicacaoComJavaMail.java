package org.example.escola.infra.indicacao;

import org.example.escola.aplicacao.Indicacao.EnviarEmailIndicacao;
import org.example.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        // Logica de envio de emails com a lib Java Mail
    }
}
