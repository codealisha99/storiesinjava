


 public class learn {

    public static void main(String[] args) {
        System.out.println("hi lishy");
        System.out.println("******\n    *\n  *\n*    \n******");

    }
}
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

// Enum for task status
enum Status {
    PENDING,
    COMPLETED
}

// Task class (Model)
class Task implements Serializable {
    private int id;
    private String title;
    private Status status;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = Status.PENDING;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void markCompleted() {
        this.status = Status.COMPLETED;
    }

    @Override
    public String toString() {
        return id + ". " + title + " [" + status + "]";
    }
}

// Service class (Business logic)
class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private static final String FILE_NAME = "tasks.dat";

    public TaskManager() {
        loadTasks();
    }

    public void addTask(String title) {
        int id = tasks.size() + 1;
        tasks.add(new Task(id, title));
        saveTasks();
    }

    public void completeTask(int id) {
        tasks.stream()
             .filter(t -> t.getId() == id)
             .findFirst()
             .ifPresent(Task::markCompleted);
        saveTasks();
    }

    public List<Task> getAllTasks() {
        return tasks;
    }

    public List<Task> getPendingTasks() {
        return tasks.stream()
                .filter(t -> t.getStatus() == Status.PENDING)
                .collect(Collectors.toList());
    }

    // File handling
    private void saveTasks() {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(tasks);
        } catch (IOException e) {
            System.out.println("Error saving tasks");
        }
    }

    @SuppressWarnings("unchecked")
    private void loadTasks() {
        File file = new File(FILE_NAME);
        if (!file.exists()) return;

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            tasks = (List<Task>) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error loading tasks");
        }
    }
}

// Background thread example
class AutoSaveThread extends Thread {
    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(10000);
                System.out.println("[AutoSave] Tasks are safe.");
            }
        } catch (InterruptedException ignored) {}
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        AutoSaveThread autoSave = new AutoSaveThread();
        autoSave.setDaemon(true);
        autoSave.start();

        while (true) {
            System.out.println("\n--- TASK MANAGER ---");
            System.out.println("1. Add Task");
            System.out.println("2. View All Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. View Pending Tasks");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter task title: ");
                    String title = sc.nextLine();
                    manager.addTask(title);
                    System.out.println("Task added!");
                    break;

                case 2:
                    manager.getAllTasks()
                           .forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter task ID: ");
                    int id = sc.nextInt();
                    manager.completeTask(id);
                    System.out.println("Task completed!");
                    break;

                case 4:
                    manager.getPendingTasks()
                           .forEach(System.out::println);
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
