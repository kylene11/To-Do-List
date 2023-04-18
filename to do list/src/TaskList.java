

import java.util.ArrayList;
import java.util.Scanner;
public class TaskList {

    static ArrayList<String> taskList = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    static void addATask() {
        System.out.println("What task would you like to add?");
        String task = scanner.nextLine();
        taskList.add(task);
        System.out.println("You have successfully added a new task.");
    }

    static void deleteATask() {
        System.out.println("To Do List:");
        for (int i = 0; i < TaskList.taskList.size(); i++) {
            System.out.println((i) + 1 + ". " + TaskList.taskList.get(i));}
        System.out.println();
        System.out.println("Which task do you want to delete?");
        System.out.println("(Enter task number:)");
       int action = scanner.nextInt();
        taskList.remove(action-1);
        System.out.println("You have successfully deleted a task.");
    }

    static void completedATask() {
        System.out.println("To Do List:");
        for (int i = 0; i < TaskList.taskList.size(); i++) {
            System.out.println((i) + 1 + ". " + TaskList.taskList.get(i));}
        System.out.println();
        System.out.println("Which task have you completed?");
        System.out.println("(Enter task number:)");
        int action = scanner.nextInt();
        taskList.remove(action-1);
        System.out.println("Yay, you have completed a task!");
    }
}
