package br.duduslugee.projeto.controllers;

import br.duduslugee.projeto.model.Funcionario;
import br.duduslugee.projeto.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping("/funcionario")
    public String index() {
        return "funcionario/index"; // Redireciona para a página inicial
    }

    @GetMapping("/funcionario/adicionar")
    public String adicionarFuncionario(Model model) {
        model.addAttribute("funcionario", new Funcionario());
        return "funcionario/adicionar-funcionario"; // Template para adicionar funcionário
    }

    @PostMapping("/funcionario/adicionar")
    public String adicionarFuncionario(@ModelAttribute Funcionario funcionario) {
        funcionarioService.adicionarFuncionario(funcionario);
        return "redirect:/funcionario/listar"; // Redireciona para a listagem
    }

    @GetMapping("/funcionario/listar")
    public String listarFuncionarios(Model model) {
        model.addAttribute("funcionarios", funcionarioService.listarFuncionarios());
        return "funcionario/listar-funcionarios"; // Template para listar funcionários
    }

    @GetMapping("/funcionario/excluir/{id}")
    public String excluirFuncionario(@PathVariable Long id) {
        funcionarioService.excluirFuncionario(id);
        return "redirect:/funcionario/listar"; // Redireciona após exclusão
    }

    @GetMapping("/funcionario/editar/{id}")
    public String editarFuncionario(@PathVariable("id") Long id, Model model) {
        Funcionario funcionario = funcionarioService.buscarFuncionarioPorId(id);
        model.addAttribute("funcionario", funcionario);
        return "funcionario/editar-funcionario"; // Substitua pelo nome correto do seu template de edição
    }

    @PostMapping("/funcionario/editar")
    public String atualizarFuncionario(Funcionario funcionario) {
        funcionarioService.adicionarFuncionario(funcionario); // Pode ser o mesmo método para adicionar
        return "redirect:/funcionario"; // Redireciona para a lista de funcionários
    }
}
