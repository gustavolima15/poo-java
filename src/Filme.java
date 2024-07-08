public class Filme {
    String nome;
    int anoDeLancamento;
    int duracaoEmMinutos;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println(nome);
        System.out.println("Ano de lançameno: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes += 1;
    }

    double obterMedia(){
        return somaDasAvaliacoes/totalDeAvaliacoes;
    }
}
