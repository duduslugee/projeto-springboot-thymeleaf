package br.duduslugee.projeto.service;

import br.duduslugee.projeto.model.ContasDoMes;
import br.duduslugee.projeto.repository.ContasDoMesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContasDoMesService {

    @Autowired
    private ContasDoMesRepository contasDoMesRepository;

    public List<ContasDoMes> listarContas(){
        return contasDoMesRepository.findAll();
    }

    public ContasDoMes adicionarConta(ContasDoMes contasDoMes){
        return contasDoMesRepository.save(contasDoMes);
    }
}
