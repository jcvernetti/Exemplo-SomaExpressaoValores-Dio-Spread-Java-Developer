package one.digitalinnovation;

public class SomaExpressao {

    public int somarexpress(String expressao){
        int soma = 0;
        for (String valorSomar : expressao.split("\\+"))
            soma += Integer.valueOf(valorSomar);
        System.out.println(soma);
        return soma;
    }
}
