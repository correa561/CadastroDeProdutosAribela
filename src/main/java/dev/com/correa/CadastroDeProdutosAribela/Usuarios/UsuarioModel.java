package dev.com.correa.CadastroDeProdutosAribela.Usuarios;

import dev.com.correa.CadastroDeProdutosAribela.Produtos.ProdutosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_usuarios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    Long id;

    @Column(name = "Usuario")
    private String usuario;

    @Column(unique = true)
    private String email;

    @Column(name = "Senha")
    private String senha;

    @OneToMany
    @JoinColumn (name = "produtos_id")
    private ProdutosModel produtos;

}
