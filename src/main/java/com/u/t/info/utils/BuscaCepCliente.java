package com.u.t.info.utils;

import com.u.t.info.view.TelaCadastroCliente;

import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;

/**
 *
 * @author Nikolas
 */
public class BuscaCepCliente implements ActionListener {

    String ruaStr;
    String bairroStr;
    String cidadeStr;
    String ufStr;

    private final TelaCadastroCliente tela;

    public BuscaCepCliente(TelaCadastroCliente tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String cep = tela.getCep().getText();
        int numCaracteres = cep.length();
        if (numCaracteres == 8) {

            buscarCep(cep);
        } else {
            JOptionPane.showConfirmDialog(null, "CEP INVÁLIDO", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
        }
    }

    public void buscarCep(String cep) {
        String json;

        try {

            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
            URLConnection urlConnection = url.openConnection();

            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();

            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");
            String array[] = new String[30];
            array = json.split("\n");

            if (array[1].equals("erro")) {
                JOptionPane.showConfirmDialog(null, "CEP INVÁLIDO", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
                tela.getRua().setText("");
                tela.getBairro().setText("");
                tela.getCidade().setText("");
                tela.getUf().setText("");
            } else {

                ruaStr = array[7];
                bairroStr = array[15];
                cidadeStr = array[19];
                ufStr = array[23];

                tela.getRua().setText(ruaStr);
                tela.getBairro().setText(bairroStr);
                tela.getCidade().setText(cidadeStr);
                tela.getUf().setText(ufStr);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
