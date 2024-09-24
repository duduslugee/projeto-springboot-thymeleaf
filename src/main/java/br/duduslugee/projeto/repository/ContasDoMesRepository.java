package br.duduslugee.projeto.repository;

import br.duduslugee.projeto.model.ContasDoMes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasDoMesRepository extends JpaRepository<ContasDoMes, Long> {
}
