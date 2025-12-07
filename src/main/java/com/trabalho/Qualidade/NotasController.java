package com.trabalho.Qualidade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/notas")
public class NotasController {

    @Autowired
    private CalculadoraService service;

    // Endpoint 1: Média Aritmética
    @GetMapping("/media")
    public double media(@RequestParam List<Double> notas) {
        return service.calcularMediaAritmetica(notas);
    }

    // Endpoint 2: Média Ponderada
    @GetMapping("/ponderada")
    public double ponderada(@RequestParam List<Double> notas, @RequestParam List<Double> pesos) {
        return service.calcularMediaPonderada(notas, pesos);
    }

    // Endpoint 3: Maior Nota
    @GetMapping("/maior")
    public double maior(@RequestParam List<Double> notas) {
        return service.encontrarMaiorNota(notas);
    }

    // Endpoint 4: Menor Nota
    @GetMapping("/menor")
    public double menor(@RequestParam List<Double> notas) {
        return service.encontrarMenorNota(notas);
    }
}