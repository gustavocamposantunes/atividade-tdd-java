package br.com.dsm.atividadetddjava.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class ClienteTest {

    @Test
    void deveFalharQuandoStatusNaoForLiberadoOuBloqueado() {
        Cliente cliente = new Cliente();

        assertThrows(IllegalArgumentException.class,
                () -> cliente.definirStatus("PENDENTE"));
    }
}
