package com.example.VendedoresReservas.Entities;

import java.util.ArrayList;
import java.util.HashMap;

public class concesionario {

    private static HashMap<String, vendedor> listarVendedores = new HashMap<>();



    public static void aniadirVendedor(vendedor vendedor){
        listarVendedores.put(vendedor.getCodven(), vendedor);
    }


    public static void modificarVendedor(String codven, String nombre, String domicilio, int telefono) {
        vendedor seller = listarVendedores.get(codven);
        seller.modificarVendedor(nombre, domicilio, telefono);
    }


    public static void borrarVendedor(String codven) {
        listarVendedores.remove(codven);
    }



    public static ArrayList<vendedor> visualizarVendedores() {
        ArrayList<vendedor> listaven = new ArrayList<>();
        listaven.addAll(listarVendedores.values());
        return listaven;
    }


}