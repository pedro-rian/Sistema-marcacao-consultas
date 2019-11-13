/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

public class Medico extends Cliente{
    String especialidade;

    public Medico(String especialidade, String usuario, String senha, String nome, String telefone) {
        super(usuario, senha, nome, telefone);
        this.especialidade = especialidade;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
}
