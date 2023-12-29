package com.exercice3;

class Database {
    private static Database instance;
    private int record;
    private String name;

    private Database(String name) {
        this.record = 0;
        this.name = name;
    }

    public static Database getInstance(String name) {
        if (instance == null) {
            instance = new Database(name);
        }
        return instance;
    }

    public void editRecord() {
        System.out.println("Enregistrement " + record + " modifié dans la base de données " + name);
    }

    public String getName() {
        return name;
    }
}

public class TestDatabase {
    public static void main(String[] args) {
        Database db1 = Database.getInstance("Database1");
        Database db2 = Database.getInstance("Database2");

        System.out.println("Nom de la base de données db1 : " + db1.getName());
        System.out.println("Nom de la base de données db2 : " + db2.getName());

        db1.editRecord();
        db2.editRecord();
    }
}

