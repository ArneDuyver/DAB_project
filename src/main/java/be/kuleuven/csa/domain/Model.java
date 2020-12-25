package be.kuleuven.csa.domain;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;

public class Model {
    public static void initialiseStartingDatabaseSQL(String dbName) {
        try {
            final String ConnectionString = "jdbc:sqlite:"+dbName+".db";
            //Establish connection with the database
            Connection connection;
            try {
                connection = DriverManager.getConnection(ConnectionString);
                connection.setAutoCommit(false);

            } catch (Exception e) {
                System.out.println("Db connection handle failure");
                e.printStackTrace();
                throw new RuntimeException(e);
            }

            //initTables
            var sql = new String(Files.readAllBytes(Paths.get("./src/main/resources/dbcreate.sql")));
            //System.out.println(sql);
            var s = connection.createStatement();
            s.executeUpdate(sql);
            s.close();

            //verifyTableContents
            var s2 = connection.createStatement();
            var result = s2.executeQuery("SELECT COUNT(*) as cnt FROM boerderij");
            assert result.getInt("cnt") == 4;
            //FIXME:
            connection.close();

        } catch (Exception e) {
            System.out.println("Error while initialising db or verifying table content");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public static void deleteDatabase(String dbName) {
        try {
            File f= new File("./"+dbName+".db");
            if(f.delete()) {
                System.out.println(f.getName() + " deleted");
            } else {
                System.out.println("failed");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
