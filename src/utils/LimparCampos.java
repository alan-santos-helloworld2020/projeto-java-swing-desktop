/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import javax.swing.JTextField;

/**
 *
 * @author alan
 */
public class LimparCampos {

    public boolean limparCampos(JTextField nome, JTextField telefone, JTextField email, JTextField cep) {

        nome.setText("");
        telefone.setText("");
        email.setText("");
        cep.setText("");
        return false;

    }

}
