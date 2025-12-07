package com.trabalho.Qualidade;

import org.springframework.stereotype.Service;
import java.util.Collections;
import java.util.List;

@Service
public class CalculadoraService {

    // Operação 1: Média Aritmética
    public double calcularMediaAritmetica(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    // Operação 2: Média Ponderada
    public double calcularMediaPonderada(List<Double> notas, List<Double> pesos) {
        if (notas == null || pesos == null || notas.size() != pesos.size() || notas.isEmpty()) {
            return 0.0;
        }

        double somaNotasPonderadas = 0;
        double somaPesos = 0;

        for (int i = 0; i < notas.size(); i++) {
            somaNotasPonderadas += (notas.get(i) * pesos.get(i));
            somaPesos += pesos.get(i);
        }

        if (somaPesos == 0) return 0.0;

        return somaNotasPonderadas / somaPesos;
    }

    // Operação 3: Maior Nota
    public double encontrarMaiorNota(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;
        return Collections.max(notas);
    }

    // Operação 4: Menor Nota
    public double encontrarMenorNota(List<Double> notas) {
        if (notas == null || notas.isEmpty()) return 0.0;
        return Collections.min(notas);
    }
}