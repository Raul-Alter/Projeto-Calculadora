package br.com.raulCodes.calc.modelo;

@FunctionalInterface
public interface MemoriaObservador {
    public void valorAlterado(String novoValor);
}
