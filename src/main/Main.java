package main;

import vista.Login;

public class Main {

    public static void main(String[] args) {
        Login login = new Login();
        login.setSize(500, 700);
        login.setResizable(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }
}
