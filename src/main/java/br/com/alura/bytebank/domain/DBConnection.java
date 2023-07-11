package br.com.alura.bytebank.domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static void main (String ... x) {
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/byte_bank?user=matheus&password=password");

            System.out.println("Conexão Recuperada.");

            connection.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
