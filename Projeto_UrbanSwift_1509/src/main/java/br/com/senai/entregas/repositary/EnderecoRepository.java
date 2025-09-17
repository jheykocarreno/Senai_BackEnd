package br.com.senai.entregas.repositary;

import br.com.senai.entregas.model.Enderecos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Enderecos, Integer> {
}
