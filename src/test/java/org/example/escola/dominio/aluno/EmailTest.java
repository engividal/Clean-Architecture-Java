package org.example.escola.dominio.aluno;

import org.example.escola.dominio.aluno.Email;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailinvalido"));
    }

    @Test
    void criarEmailComEnderecoValido() {
        String myEmail = "engividal@gmail.com";
        Email email = new Email(myEmail);
        assertEquals(myEmail, email.getEndereco());
    }
}
