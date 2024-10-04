package br.duduslugee.projeto.service;

import br.duduslugee.projeto.model.Servico;
import br.duduslugee.projeto.repository.ServicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository servicoRepository;

    public List<Servico> listarServico() {
        return servicoRepository.findAll();
    }

    public void adicionarServico(Servico servico) {
        servicoRepository.save(servico);
    }

    public void excluirServico(Long id) {
        servicoRepository.deleteById(id);
    }
}
