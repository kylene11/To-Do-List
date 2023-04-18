import java.util.Scanner;

public class Main {

    public static void main(String[] args)throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Your To Do List!");
     while(true){
         System.out.println();
        System.out.println("What would you like to do today?");
        System.out.println("1. Add a task");
        System.out.println("2. Delete a task");
        System.out.println("3. Cross off a completed task");
        System.out.println("4. View To Do List");
         System.out.println("5. Close the program");
         System.out.println("(Enter action number:)");
        int action = scanner.nextInt();

        switch (action) {
            case 1 -> TaskList.addATask();
            case 2 -> TaskList.deleteATask();
            case 3 -> TaskList.completedATask();
            case 4 -> {
                System.out.println();
                System.out.println("To Do List:");
                for (int i = 0; i < TaskList.taskList.size(); i++) {
                    System.out.println((i) + 1 + ". " + TaskList.taskList.get(i));
                }
            }
            case 5 -> {
                System.out.println("You have exited the program. Goodbye.");
                System.exit(0);
            }
            default -> {
                System.out.println("You did not enter a valid number. Please try again.");
                }
            }


                }

        }
        }

