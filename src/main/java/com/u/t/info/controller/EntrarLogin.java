package com.u.t.info.controller;

import com.u.t.info.src.Cliente;
import com.u.t.info.utils.Arquivo;
import com.u.t.info.utils.JSONCliente;
import com.u.t.info.view.TelaInicial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * OBS: APENAS TESTANDO COM CLIENTE
 * POSTERIORMENTE VAI MUDAR
 */

/**
 *
 * @author Nikolas
 */
public class EntrarLogin implements ActionListener {

    private final TelaInicial tela;

    public EntrarLogin(TelaInicial tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            //janela é aberta
            String dados = Arquivo.lerArquivo("clientes.json");
            int login = 0;

            List<Cliente> cliente = JSONCliente.toClientes(dados);

            for (Cliente clientes : cliente) {
                if (tela.getJfUsuario().getText().equals(clientes.getNome())){
                    //chamar tela
                    JOptionPane.showMessageDialog(null, "Bem-Vindo!", "UTINFO", JOptionPane.INFORMATION_MESSAGE, null);
                    login = 1;
                    break;
                }
            }
            if (login == 0) {
                JOptionPane.showConfirmDialog(null, "Usuário/Senha incorreto(s)!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
            }

        } catch (FileNotFoundException ex) {
            //JOptionPane.showConfirmDialog(tela, "Não foi possível carregar os dados!");
            JOptionPane.showConfirmDialog(null, "Não foi possível carregar os dados!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);

        }
    }
}

