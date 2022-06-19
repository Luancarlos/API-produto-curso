package br.com.demoapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExemploTest {

    @DisplayName("Exemplo teste")
    @Test
    void Test() {
        String nome = "API";
        Assertions.assertEquals(nome, "API");
    }
}
