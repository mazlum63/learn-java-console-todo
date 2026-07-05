import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TodoService todoService = new TodoService();

        boolean exit = false;

        while (!exit) {
            System.out.println("1 - Add Todo");
            System.out.println("2 - List Todo");
            System.out.println("3 - Complete Todo");
            System.out.println("4 - Delete Todo");
            System.out.println("0 - Exit");

            int selected = scanner.nextInt();
            scanner.nextLine();

            switch (selected) {
                case 1:
                    System.out.println("Add Title");
                    String title = scanner.nextLine();
                    todoService.addTodo(title);
                    break;
                case 2:
                    for (Todo todo : todoService.getTodos()) {
                        System.out.println(todo);
                    }
                    break;
                case 3: {
                    System.out.println("Give Todo Id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    todoService.completeTodo(id);
                    break;
                }
                case 4: {
                    System.out.println("Give Todo Id");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    todoService.deleteTodo(id);
                    break;
                }

                case 0: {
                    exit = true;
                    break;
                }

                default:
                    System.out.println("Invalid selection");

                    break;
            }
        }

        scanner.close();
    }
}