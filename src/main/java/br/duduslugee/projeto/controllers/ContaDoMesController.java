package br.duduslugee.projeto.controllers;

import br.duduslugee.projeto.model.ContasDoMes;
import br.duduslugee.projeto.service.ContasDoMesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
public class ContaDoMesController {

    @Autowired
    private ContasDoMesService contasDoMesService;

    @GetMapping("/contas")
    public String index(Model model) {
        List<ContasDoMes> contasdomes = contasDoMesService.listarContas();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        for (ContasDoMes conta : contasdomes) {
            String formattedDate = conta.getDataCadastro().format(formatter);
            conta.setFormattedData(formattedDate);
        }

        model.addAttribute("contasdomes", contasdomes);
        return "contas/listar-contas";
    }

    @GetMapping("/contas/adicionar")
    public String adicionarContaForm(Model model) {
        model.addAttribute("contasdomes", new ContasDoMes());
        return "contas/adicionar-conta";
    }

    @PostMapping("/contas/adicionar")
    public String adicionarConta(@ModelAttribute ContasDoMes contasDoMes) {
        contasDoMesService.adicionarConta(contasDoMes);
        return "redirect:/contas";
    }
}