package br.com.joao.gerenciador_tarefas.controller;


import org.springframework.web.bind.annotation.*;
import br.com.joao.gerenciador_tarefas.model.Tarefa;
import br.com.joao.gerenciador_tarefas.service.TarefaService;
import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
@CrossOrigin("*")
public class TarefaController {

    private final TarefaService service;

    public TarefaController(TarefaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Tarefa> listar() {
        return service.listar();
    }

    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        return service.salvar(tarefa);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}