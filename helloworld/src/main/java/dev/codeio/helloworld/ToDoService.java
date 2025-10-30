package dev.codeio.helloworld;

import dev.codeio.helloworld.Models.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    @Autowired
    private  ToDoRepository toDoRepository;

   public Todo createTodo(Todo todo){
       return toDoRepository.save(todo);
   }

   public Todo getTodoById(Long id){
       return toDoRepository.findById(id).orElseThrow(()-> new RuntimeException("todo not found"));
   }

   public List<Todo> getTodos(){
       return toDoRepository.findAll();
   }

   public Todo updatetodo(Todo todo){
       return toDoRepository.save(todo);
   }

    public void deleteTodoById (long id){
        toDoRepository.delete(getTodoById(id));
    }

    public void deleteTodo(Todo todo){
        toDoRepository.delete(todo);
    }
}
