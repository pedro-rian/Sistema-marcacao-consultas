/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
public class Paciente extends Cliente{
    String cpf;
   
    public Paciente(String cpf, String usuario, String senha, String nome, String telefone) {
        super(usuario, senha, nome, telefone);
        this.cpf = cpf;
    }
    
}
