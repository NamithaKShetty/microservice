package com.d;

class MySQLDatabase {
    public String connect() {
        return "Connected to MySQL";
    }
}

class Application {
    private MySQLDatabase database;

    public Application() {
        this.database = new MySQLDatabase();
    }

    public String getData() {
        return database.connect();
    }
}


interface Database {
    String connect();
}

class MySQLDatabaseCorrect implements Database {
    @Override
    public String connect() {
        return "Connected to MySQL";
    }
}

class PostgreSQLDatabase implements Database {
    @Override
    public String connect() {
        return "Connected to PostgreSQL";
    }
}


public class ApplicationCorrect {
    private Database database;

        public ApplicationCorrect(Database database) {
        this.database = database;
    }

    public String getData() {
        return database.connect();
    }

    public static void main(String[] args) {
        // Using MySQL
        ApplicationCorrect appMySQL = new ApplicationCorrect(new MySQLDatabaseCorrect());
        System.out.println(appMySQL.getData());

        // Using PostgreSQL
        ApplicationCorrect appPostgreSQL = new ApplicationCorrect(new PostgreSQLDatabase());
        System.out.println(appPostgreSQL.getData());
    }
}
