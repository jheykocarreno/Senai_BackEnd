package br.com.senai.entregas.repositary;

import br.com.senai.entregas.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Veiculos, Integer> {
}
