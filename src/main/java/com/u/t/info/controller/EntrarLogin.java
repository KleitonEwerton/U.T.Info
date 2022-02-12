package com.u.t.info.controller;

import com.u.t.info.src.*;
import com.u.t.info.utils.*;
import com.u.t.info.view.TelaGerente;
import com.u.t.info.view.TelaInicial;
import com.u.t.info.view.TelaSupervisor;
import com.u.t.info.view.TelaVendedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
        //janela é aberta
        int login = 0;

        List<Funcionario> funcionarios = Funcionario.retornaListaFuncionarios();

        for (Funcionario funcionario: funcionarios) {
            if (tela.getJfUsuario().getText().equals(funcionario.getCpf())
            && tela.getJpSenha().getText().equals(funcionario.getSenha())){
                switch (funcionario.getClass().getTypeName())
                {
                    case "com.u.t.info.src.Gerente":
                        TelaGerente telaGerente = new TelaGerente((Gerente) funcionario);
                        telaGerente.draw();
                        tela.dispose();
                        login = 1;
                        break;
                    case "com.u.t.info.src.Supervisor":
                        TelaSupervisor telaSupervisor = new TelaSupervisor((Supervisor) funcionario);
                        telaSupervisor.desenha();
                        tela.dispose();
                        telaSupervisor.pack();
                        login = 1;
                        break;
                    case "com.u.t.info.src.Vendedor":
                        TelaVendedor telaVendedor = new TelaVendedor((Vendedor) funcionario);
                        telaVendedor.desenha();
                        tela.dispose();
                        login = 1;
                        break;
                }
            }
        }
        if (login == 0) {
            JOptionPane.showConfirmDialog(null, "Usuário/Senha incorreto(s)!", "ERRO", JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, null);
        }

    }
}

