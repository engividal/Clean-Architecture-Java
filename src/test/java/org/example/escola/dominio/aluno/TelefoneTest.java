package org.example.escola.dominio.aluno;

import org.example.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TelefoneTest {
    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("92", null));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("92", ""));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("92", "123"));
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
        String ddd = "11";
        String numero = "998171631";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDDD());
        assertEquals(numero, telefone.getNumero());
    }
}
