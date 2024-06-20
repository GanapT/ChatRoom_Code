package main;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Chatroom {
    public static String[] getMessages(String chatroomName) throws IOException {
        File inputFile = new File("chatroom_" + chatroomName + ".txt");
        Scanner in = new Scanner(inputFile);
        String messages = "";
        while (in.hasNextLine()) {
            messages += in.nextLine() + "\n";
        }
        in.close();
        return messages.split("\n");
    }

    
    public static void newcreateChatroom(String chatroomName) throws IOException {
        File inputFile = new File("chatroom_" + chatroomName);
        if (inputFile.exists()) return;
        inputFile.createNewFile();
        Scanner in = new Scanner(inputFile);
        PrintWriter out = new PrintWriter("chatroom_" + chatroomName );
        
        in.close();
        out.close();
    }

    public static void addMessage(String chatroomName, String username, String message) throws IOException {
        File inputFile = new File("chatroom_" + chatroomName );
        Scanner in = new Scanner(inputFile);
        String fileText = "";
        while (in.hasNextLine()) {
            fileText += in.nextLine() + "\n";
        }

        PrintWriter out = new PrintWriter("chatroom_" + chatroomName);
        out.print(fileText);
        out.println("[" + username + "]: " + message);

        in.close();
        out.close();
    }

    public static void clearMessages(String chatroomName) throws IOException {
        PrintWriter out = new PrintWriter("chatroom_" + chatroomName );
        out.print("\n");
        out.close();
    }

    public static boolean chatroomExists(String chatroomName) {
        File inputFile = new File("user_" + chatroomName );
        return inputFile.exists();
    }

}