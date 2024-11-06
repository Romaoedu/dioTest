package org.example;

import java.util.Scanner;

public class Main {

    // TODO: Preencha a função para verificar queda de conexão

    public static String verificarQuedaConexao(String[] velocidades) {

        Boolean caiuConecxao = true;

        for (String velocidade : velocidades){
            if (velocidade.trim().equals("0")){
                caiuConecxao = true;
                break;
            }else
                caiuConecxao = false;
        }

        if (caiuConecxao){
            return "Queda de Conexao";
        }else
            return "Sem Quedas";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
       System.out.println(resultado);

        scanner.close();
    }
}