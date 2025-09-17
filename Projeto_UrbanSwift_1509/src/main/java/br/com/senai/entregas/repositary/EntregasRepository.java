package br.com.senai.entregas.repositary;

import br.com.senai.entregas.model.Entregas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface EntregasRepository extends JpaRepository<Entregas, Integer> {
}
