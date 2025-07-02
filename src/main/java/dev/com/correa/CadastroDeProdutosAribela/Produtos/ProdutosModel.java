package dev.com.correa.CadastroDeProdutosAribela.Produtos;

import dev.com.correa.CadastroDeProdutosAribela.Usuarios.UsuarioModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Entity
@Table(name = "tb_produtos")

@Data // cria get e sets
@NoArgsConstructor // cria noargs
@AllArgsConstructor // cria allargs

public class ProdutosModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeProduto;
    private int quantidade;

    @OneToMany(mappedBy = "produto")
    private List<UsuarioModel> usuario;


}
