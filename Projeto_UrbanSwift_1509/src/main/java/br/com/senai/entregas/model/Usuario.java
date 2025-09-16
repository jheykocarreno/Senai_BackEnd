package br.com.senai.entregas.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id", nullable = false)
    private Integer usuarioId;

    @Column(name = "nome_completo", nullable = false)
    private String nomeCompleto;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "senha", nullable = false)
    private String senha;

    //Muitos USUARIOS para un TIPO DE USUARIO
    //FetchType.EAGER - Carrega os dados juntos
    //optional - Se é obrigatirio ou não
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    //Avisar para o Java, qual coluna do tipo usuario vou relacionar
    @JoinColumn(name = "tipo_usuario_id")
    private TipoUsuario tipoUsuario;

}
