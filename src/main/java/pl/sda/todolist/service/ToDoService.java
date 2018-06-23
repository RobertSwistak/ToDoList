package pl.sda.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.todolist.model.TodoTask;
import pl.sda.todolist.repository.ToDoRepository;

@Service
public class ToDoService {
    @Autowired
    public ToDoRepository toDoRepository;

    public TodoTask add (TodoTask newToDoTask){
        toDoRepository.save(newToDoTask);
        return newToDoTask;
    }
}
