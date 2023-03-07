package com.example.projetosessao;

public class Usuario {
    private String login,senha;

    public Usuario(){}
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String setLogin(String login) {
        this.login = login;
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
