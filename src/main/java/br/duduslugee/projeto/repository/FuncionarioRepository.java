package br.duduslugee.projeto.repository;

import br.duduslugee.projeto.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
