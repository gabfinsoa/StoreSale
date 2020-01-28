package utils;

import lombok.Data;

//import cucumber.api.java.it.Data;

@Data
public class Produto {

    String nome;
    String sku;
    String imagem;
    String precoUnitario;
    String tamanho;
    String precoAntigo;
    String precoNovo;
    boolean isSapato, isPromocional;
    double precoUnitarioValor;

}
