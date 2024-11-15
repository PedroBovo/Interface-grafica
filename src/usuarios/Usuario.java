/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

/**
 *
 * @author Pedro
 */
public class Usuario {
    
    private String Nome;
    private int idade;
    private String cpf;
    private String sexo;
    private String senha;
    private String cargo;
    
    public Usuario(){}

    public Usuario(String Nome, int idade, String cpf,String sexo,String cargo, String senha) {
        this.Nome = Nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
        this.cargo = cargo;
        this.senha = senha;
    }
    public Usuario(String Nome, int idade,String sexo,String cargo, String cpf) {
        this.Nome = Nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cargo = cargo;
        this.cpf = cpf;
    }
    
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
}
