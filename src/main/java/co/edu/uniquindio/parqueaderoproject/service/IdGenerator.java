package co.edu.uniquindio.parqueaderoproject.service;

public class IdGenerator {

    public static IdGenerator instance;

    private IdGenerator() {}

    public static IdGenerator getInstance() {

        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }

    public String generateId() {

        return ""; //CODIGO GENERADOR DE ID

    }

}
