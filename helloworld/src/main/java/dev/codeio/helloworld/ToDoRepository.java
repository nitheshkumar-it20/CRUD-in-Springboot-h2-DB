package dev.codeio.helloworld;

import dev.codeio.helloworld.Models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<Todo, Long> {

}
