package co.edu.uniquindio.parqueaderoproject.service;

import java.util.Random;

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


            String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
            StringBuilder id = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < 6; i++) {
                int indice = random.nextInt(caracteres.length());
                id.append(caracteres.charAt(indice));
            }

            return id.toString();


    }

}
