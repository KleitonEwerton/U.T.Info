package com.u.t.info.controller;

import com.u.t.info.src.Cliente;
import com.u.t.info.view.TelaCadastroCliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Nikolas
 */
public class AdicionarCliente implements ActionListener {

    private final TelaCadastroCliente tela;

    public AdicionarCliente(TelaCadastroCliente tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            String str = tela.getTel().getSelection().getActionCommand();
            Cliente cliente = new Cliente(tela.getNome().getText(), tela.getCpf().getText(),
                    tela.getCep().getText(), tela.getRua().getText(), tela.getNumeroCasa().getText(),
                    tela.getBairro().getText(), tela.getCidade().getText(), tela.getUf().getText(),
                    tela.getTel1().getText(), str);
            tela.getClientes().add(cliente);
            JOptionPane.showMessageDialog(tela, "Cliente adicionado");
            LimparFormularioCliente limpar= new LimparFormularioCliente(tela);
            limpar.LimparFormulario();
        } catch (NullPointerException e) {
            JOptionPane.showConfirmDialog(null, "Selecione o tipo do número", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
        }
    }
}
