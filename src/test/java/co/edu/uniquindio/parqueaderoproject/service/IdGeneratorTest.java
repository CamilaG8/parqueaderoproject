package co.edu.uniquindio.parqueaderoproject.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorTest {

    @Test
    void generarId(){

        IdGenerator idGenerator = IdGenerator.getInstance();
        String id = idGenerator.generateId();
        System.out.println(id);
        assertEquals(6, id.length());

    }

}