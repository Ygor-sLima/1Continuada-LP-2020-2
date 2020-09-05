package br.com.bandtec.projetoindividual;

/**
 *
 * @author Ritswy
 */
public class Recurso {
    //Informação recebida no momento
    // Ex: em CPU 1.6, em Disco 22ms...
    Double dado;
    //Apenas o dado não serve no nosso sistema, utilizamos também porcentagem
    Double porcentagem;
    //Diferenciar dos outros
    //Será ou ms, ou GHz, ou GB
    String medida;
    //Maior valor possível que pode ser lido, em memória no meu caso é 2.0 GB
    //Também é usado para verificar a porcentagem que será calculada.
    Double maximoPossivel;
    //Menor valor lido entre todos valores lidos
    Double minimoPorcentagem = 100.00;
    //Maior valor lido entre todos valores lidos
    Double maximoPorcentagem = 0.00;
    //Como a média varia essa duas variaveis são usadas para fazer a média toda
    //vez que algum valor for lido
    Double somaPorcentagem = 0.0;
    Integer leituras = 0;
}
