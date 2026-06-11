package br.com.joao.gerenciador_tarefas.service;


import org.springframework.stereotype.Service;
import br.com.joao.gerenciador_tarefas.model.Tarefa;
import br.com.joao.gerenciador_tarefas.repository.TarefaRepository;
import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository repository;

    public TarefaService(TarefaRepository repository) {
        this.repository = repository;
    }

    public List<Tarefa> listar() {
        return repository.findAll();
    }

    public Tarefa salvar(Tarefa tarefa) {
        return repository.save(tarefa);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
