package br.duduslugee.projeto.controllers;

import br.duduslugee.projeto.model.ContasDoMes;
import br.duduslugee.projeto.service.ContasDoMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContaDoMesController {

    @Autowired
    private ContasDoMesService contasDoMesService;

    @GetMapping("/contas")
    public String index() {
        return "contas/listar-contas"; // Redireciona para a página de listagem
    }

    @GetMapping("/contas/adicionar")
    public String adicionarContaForm(Model model) {
        model.addAttribute("contasdomes", new ContasDoMes()); // Cria um novo objeto ContasDoMes para o formulário
        return "contas/adicionar-conta"; // Retorna a página do formulário de adição
    }

    @PostMapping("/contas/adicionar")
    public String adicionarConta(@ModelAttribute ContasDoMes contasDoMes) {
        contasDoMesService.adicionarConta(contasDoMes);
        return "redirect:/contas"; // Redireciona para a listagem de contas
    }

    @GetMapping("/contas/listar")
    public String listarContas(Model model) {
        model.addAttribute("contasdomes", contasDoMesService.listarContas()); // Supondo que você tenha um método para listar contas
        return "contas/listar-contas"; // Retorna a página de listagem de contas
    }
}
