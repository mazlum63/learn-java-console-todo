import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TodoService {
    private int idCounter = 1;
    private List<Todo> todos = new ArrayList<>();

    public Todo addTodo(String title) {
        Todo newTodo = new Todo(idCounter, title);
        todos.add(newTodo);
        idCounter++;
        return newTodo;
    }

    public List<Todo> getTodos() {
        return new ArrayList<>(todos);
    }

    public boolean completeTodo(int id) {
        Optional<Todo> todo = todos.stream().filter(t -> t.getId() == id).findFirst();
        if (todo.isPresent()) {
            todo.get().markAsCompleted();
            return true;
        }
        return false;
    }

    public boolean deleteTodo(int id) {
        Optional<Todo> todo = todos.stream().filter(t -> t.getId() == id).findFirst();
        if (todo.isPresent()) {
            todos.remove(todo.get());
            return true;
        }

        // todos.removeIf(t-> t.getId() == id);
        return false;
    }
}
