/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.u.t.info.utils;

import javax.swing.JOptionPane;

/**
 *
 * @author KleitonEwerton
 */
public class Utils {
    
    public static int confirmacaoExclusao(){
        
        return JOptionPane.showConfirmDialog(null,"Você realmente quer fazer isso?","Excluir",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
    }
    
}
