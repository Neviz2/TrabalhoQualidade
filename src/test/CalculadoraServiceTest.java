package com.trabalho.Qualidade;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CalculadoraServiceTest {

    @Autowired
    private CalculadoraService service;

    @Test
    void testeMediaAritmetica() {
        List<Double> notas = Arrays.asList(10.0, 8.0, 6.0);
        double resultado = service.calcularMediaAritmetica(notas);
        assertEquals(8.0, resultado);
    }

    @Test
    void testeMediaPonderada() {
        List<Double> notas = Arrays.asList(10.0, 5.0);
        List<Double> pesos = Arrays.asList(2.0, 3.0);
        double resultado = service.calcularMediaPonderada(notas, pesos);
        assertEquals(7.0, resultado);
    }

    @Test
    void testeMaiorNota() {
        List<Double> notas = Arrays.asList(2.0, 10.0, 5.0);
        double resultado = service.encontrarMaiorNota(notas);
        assertEquals(10.0, resultado);
    }

    @Test
    void testeMenorNota() {
        List<Double> notas = Arrays.asList(2.0, 10.0, 5.0);
        double resultado = service.encontrarMenorNota(notas);
        assertEquals(2.0, resultado);
    }
}