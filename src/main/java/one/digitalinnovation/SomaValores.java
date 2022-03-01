package one.digitalinnovation;

public class SomaValores {

    public int somarValores(int ...valores){
        int soma = 0;
        for (int valor : valores){
            soma += valor;
        }
        System.out.println(soma);
        return soma;
    }
}
