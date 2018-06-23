package pl.sda.todolist.contorllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.todolist.model.TodoTask;

@RestController
@RequestMapping
public class TodoController {

    @RequestMapping(path = "/test", method = RequestMethod.GET)
    public ResponseEntity<TodoTask> test(){
        return ResponseEntity.ok(new TodoTask());
    }
}
