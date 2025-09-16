package br.com.senai.entregas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Lombok
@Getter
@Setter
// OBRIGATÓRIO para o JPA funcionar
@NoArgsConstructor
@AllArgsConstructor
// JPA
// Entity - Informa que essa classe é uma tabela
@Entity
// Table - Permite que voce configure a tabela
@Table(name = "tipo_usuario")
public class TipoUsuario {

    // Id - Define que é chave primária
    @Id
    // Generated Value - define que a chave é gerenciada pelo BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Column - configura a coluna
    // name - nome da coluna
    // nullable - se poder se nulo ou não
    @Column(name = "tipo_usuario_id", nullable = false)
    private Integer tipoUsuarioId;

    @Column(name = "descricao"
            , nullable = false
            , columnDefinition = "TEXT")
    private String descricao;
}
