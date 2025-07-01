package dev.com.correa.CadastroDeProdutosAribela;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String usuario;
    String email;
    String senha;

    public UsuarioModel() {
    }

    public UsuarioModel(String usuario, String email, String senha) {
        this.usuario = usuario;
        this.email = email;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
