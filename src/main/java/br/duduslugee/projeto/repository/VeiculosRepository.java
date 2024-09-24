package br.duduslugee.projeto.repository;

import br.duduslugee.projeto.model.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Long> {
}
