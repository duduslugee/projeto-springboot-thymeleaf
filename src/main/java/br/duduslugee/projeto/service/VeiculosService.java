package br.duduslugee.projeto.service;

import br.duduslugee.projeto.model.Veiculos;
import br.duduslugee.projeto.repository.VeiculosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculosService {

    @Autowired
    private VeiculosRepository veiculosRepository;

    public List<Veiculos> listarVeiculos() {
        return veiculosRepository.findAll();
    }

    public void adicionarVeiculo(Veiculos veiculo) {
        veiculosRepository.save(veiculo);
    }

    public void excluirVeiculo(Long id) {
        veiculosRepository.deleteById(id);
    }
}
