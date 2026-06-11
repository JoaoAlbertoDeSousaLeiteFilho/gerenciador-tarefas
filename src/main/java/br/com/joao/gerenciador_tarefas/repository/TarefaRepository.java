package br.com.joao.gerenciador_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.joao.gerenciador_tarefas.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
}
