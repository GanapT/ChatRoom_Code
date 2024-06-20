package main;
import java.util.Scanner;
import java.io.*;

public class Account {
    public static String[] getChatrooms(String username) throws IOException {
        File inputFile = new File("user_" + username + ".txt");
        Scanner in = new Scanner(inputFile);
        String chatrooms = "";
        in.nextLine();
        in.nextLine();
        while (in.hasNextLine()) {
            chatrooms += in.nextLine() + "\n";
        }
        in.close();
        return chatrooms.split("\n");
    }

    public static void createAccount(String username, String password) throws IOException {
        File inputFile = new File("user_" + username + ".txt");
        if (inputFile.exists()) return;
        inputFile.createNewFile();
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("user_" + username + ".txt");
        out.println(password + "\n");
        in.close();
        out.close();
    }

    public static void addChatroom(String username, String chatroomName) throws IOException {
        File inputFile = new File("user_" + username + ".txt");
        Scanner in = new Scanner(inputFile);
        String fileText = "";
        while (in.hasNextLine()) {
            fileText += in.nextLine() + "\n";
        }

        PrintWriter out = new PrintWriter("user_" + username + ".txt");
        out.print(fileText);
        out.println(chatroomName);

        in.close();
        out.close();
    }


    public static boolean userExists(String username) {
        File inputFile = new File("user_" + username + ".txt");
        return inputFile.exists();
    }

    public static String getPassword(String username) throws IOException {
        File inputFile = new File("user_" + username + ".txt");
        Scanner in = new Scanner(inputFile);
        String password = in.nextLine();

        in.close();

        return password;
    }
}