# ChatRoom_Code
This document describes a command-line interface (CLI) based chat application designed to provide basic chat functionalities including user authentication, chat room management, and command execution within chat contexts. This application is intended for educational or small scale deployment scenarios.

Features:
User Authentication
Register: Users can create a new account by setting a unique username and password.
Login: Users can log into the application using their credentials. Error messages are displayed for invalid attempts.
Logout: Allows users to safely log out and return to the initial login screen.

Chat Room Management
Create a Room: Users can create a new chat room with a unique name consisting of lowercase letters and numbers.
Join a Room: Users can join an existing chat room by entering its name. Errors are displayed if the room does not exist.
Leave a Room: Users can leave the current chat room and return to the main menu.

Chat Commands
/list: Lists all users currently in the chat room.
/leave: Exits the current chat room.
/history: Shows all past messages in the current chat room.
/help: Displays a list of available commands.

Account Management
Update Account Information: Users can change their username or password.
