package br.com.alura.screenmatch.exception;

// Classe de Exception para a conversão de erro do ano

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    public String getMessage() {
        return this.mensagem;
    }

    // Recebe a mensagem de erro
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }
}
