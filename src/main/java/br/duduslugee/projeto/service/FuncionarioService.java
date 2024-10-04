package br.duduslugee.projeto.service;

import br.duduslugee.projeto.model.Funcionario;
import br.duduslugee.projeto.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }

    public Funcionario adicionarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    public void excluirFuncionario(Long id) {
        funcionarioRepository.deleteById(id);
    }

    public Funcionario buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.findById(id).orElse(null);
    }

    public Funcionario atualizarFuncionario(Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }
}
