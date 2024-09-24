package br.duduslugee.projeto.controllers;

import br.duduslugee.projeto.model.Veiculos;
import br.duduslugee.projeto.service.VeiculosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class VeiculosController {

    @Autowired
    private VeiculosService veiculosService;

    @GetMapping("/veiculos")
    public String listarVeiculos(Model model) {
        List<Veiculos> veiculos = veiculosService.listarVeiculos();
        model.addAttribute("veiculos", veiculos);
        return "veiculos/listar-veiculos"; // Nome do template para a listagem de veículos
    }

    @GetMapping("/veiculos/adicionar")
    public String adicionarVeiculoForm(Model model) {
        model.addAttribute("veiculo", new Veiculos()); // Novo objeto para o formulário
        return "veiculos/adicionar-veiculo"; // Nome do template para adicionar veículo
    }

    @PostMapping("/veiculos/adicionar")
    public String adicionarVeiculo(@ModelAttribute Veiculos veiculo) {
        veiculosService.adicionarVeiculo(veiculo);
        return "redirect:/veiculos"; // Redireciona para a listagem de veículos
    }
}
