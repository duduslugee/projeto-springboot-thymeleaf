package br.duduslugee.projeto.controllers;

import br.duduslugee.projeto.model.Servico;
import br.duduslugee.projeto.service.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;  // Import necessário para o @PathVariable
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @GetMapping("/servicos")
    public String listarServicos(Model model) {
        List<Servico> servicos = servicoService.listarServico();
        model.addAttribute("servicos", servicos);
        return "servicos/listar-servicos"; // Nome do template para a listagem de serviços
    }

    @GetMapping("/servicos/adicionar")
    public String adicionarServicoForm(Model model) {
        model.addAttribute("servico", new Servico()); // Novo objeto para o formulário
        return "servicos/adicionar-servico"; // Nome do template para adicionar serviço
    }

    @PostMapping("/servicos/adicionar")
    public String adicionarServico(@ModelAttribute Servico servico) {
        servicoService.adicionarServico(servico);
        return "redirect:/servicos"; // Redireciona para a listagem de serviços
    }

    @GetMapping("/servicos/excluir/{id}")
    public String excluirServico(@PathVariable Long id) {
        servicoService.excluirServico(id);
        return "redirect:/servicos"; // Redireciona para a listagem de serviços após exclusão
    }
}
