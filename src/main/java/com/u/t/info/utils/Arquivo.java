package com.u.t.info.utils;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Nikolas
 */
public class Arquivo {
    public static String lerArquivo(String caminho) throws FileNotFoundException {

        StringBuilder conteudo = new StringBuilder();
        File arquivo = new File(caminho);

        Scanner leitor = new Scanner(arquivo);

        //varrendo conteudo do arquivo linha por linha
        while (leitor.hasNextLine()) {
            conteudo.append(leitor.nextLine()).append("\n");
        }
        return conteudo.toString();
    }

    public static void escreverArquivo(String caminho, String conteudo) throws IOException {
        FileWriter fwArquivo;
        BufferedWriter bwArquivo;

        File arquivo = new File(caminho);

        //Se o arquivo já existir, então abrir para concatenação, caso contrário criar novo arquivo
        fwArquivo = new FileWriter(arquivo, false);
        bwArquivo = new BufferedWriter(fwArquivo);

        // escrevendo String no arquivo e adicionando caracter para criar nova linha
        bwArquivo.write(conteudo);

        // fechando o arquivo
        bwArquivo.close();
        fwArquivo.close();
    }

}
