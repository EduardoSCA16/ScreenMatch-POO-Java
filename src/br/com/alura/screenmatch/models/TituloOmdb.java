package br.com.alura.screenmatch.models;

// Record = classe simplificada para armazenar dados
// Gera automaticamente construtor, acessores, equals(), hashCode() e toString()
public record TituloOmdb(String title, String year, String runtime) {
}
