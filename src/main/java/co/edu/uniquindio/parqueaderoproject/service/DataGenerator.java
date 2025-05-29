package co.edu.uniquindio.parqueaderoproject.service;

import co.edu.uniquindio.parqueaderoproject.model.classes.*;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class DataGenerator {

    Parqueadero parqueadero;
    IdGenerator idGenerator;

    public void generarData(){

        parqueadero = Parqueadero.getInstancia();
        idGenerator = IdGenerator.getInstance();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        ArrayList<Pago> pagos = new ArrayList<>();
        ArrayList<Ingreso> ingresos = new ArrayList<>();

        ArrayList<Vehiculo> vehiculos1 = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos2 = new ArrayList<>();
        ArrayList<Vehiculo> vehiculos3 = new ArrayList<>();

        //Cliente 1 Moto
        Cliente cliente1 = new Cliente(idGenerator.generateId(),"Cristian Aristizabal",
                "10948896325","3125558749","jorgito@gmail.com");
        //Cliente 2 Carro
        Cliente cliente2 = new Cliente(idGenerator.generateId(),"Laura Gonzalez",
                "10947523654","3004578965","roberto@gmail.com");
        //Cliente 3 Camion
        Cliente cliente3 = new Cliente(idGenerator.generateId(), "Katy Correa","1094178952",
                "3178524698","elvio@gmail.com");

        //Vehiculo 1 asociado con Cliente 1
        Vehiculo vehiculo1 = new Moto(idGenerator.generateId(), "ERT22H","azul","2020",
                150,new Membresia("mensual",120000),"10948896325");
        //Vehiculo 2 asociado con Cliente 2
        Vehiculo vehiculo2 = new Automovil(idGenerator.generateId(), "DXS891","gris oscuro",
                "2016","Renault",new Membresia("trimestral",300000),"10947523654");
        //Vehiculo 3 asociado con Cliente 3
        Vehiculo vehiculo3 = new Camion(idGenerator.generateId(), "DTY771","rojo","2018",
                3,new Membresia("anual",1000000),"1094178952");



        //Pago 1 membresia mensual cliente 1
        Pago pago1 = new Pago("10948896325","Membresía mensual","ERT22H",
                120000);
        Pago pago2 = new Pago("10947523654","Membresía trimestral","DXS891",
                300000);
        Pago pago3 = new Pago("1094178952","Membresía anual","DTY771",
                1000000);

        Ingreso ingreso1 = new Ingreso(idGenerator.generateId(), LocalDateTime.now().minusHours(2),
                "DXT779","carro");
        ingreso1.setSalida(LocalDateTime.now());
        Ingreso ingreso2 = new Ingreso(idGenerator.generateId(), LocalDateTime.now().minusHours(3),
                "DRX88E","moto");
        ingreso2.setSalida(LocalDateTime.now());
        Ingreso ingreso3 = new Ingreso(idGenerator.generateId(), LocalDateTime.now().minusHours(4),
                "TRR777","camion");
        ingreso3.setSalida(LocalDateTime.now());

        vehiculos1.add(vehiculo1);
        vehiculos2.add(vehiculo2);
        vehiculos3.add(vehiculo3);


        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);

        vehiculos.add(vehiculo1);
        vehiculos.add(vehiculo2);
        vehiculos.add(vehiculo3);

        pagos.add(pago1);
        pagos.add(pago2);
        pagos.add(pago3);

        ingresos.add(ingreso1);
        ingresos.add(ingreso2);
        ingresos.add(ingreso3);

        cliente1.setVehiculos(vehiculos1);
        cliente2.setVehiculos(vehiculos2);
        cliente3.setVehiculos(vehiculos3);

        parqueadero.setClientes(clientes);
        parqueadero.setVehiculos(vehiculos);
        parqueadero.setPagos(pagos);
        parqueadero.setIngresos(ingresos);

    }

}
