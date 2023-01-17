package com.example;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        Producto p2 = new Producto();
        Producto p3 = new Producto();
        Producto p4 = new Producto();
        Producto p5 = new Producto();

        p1.setPrecio(1.00);
        p2.setPrecio(2.00);
        p3.setPrecio(5.00);
        p4.setPrecio(4.00);
        p5.setPrecio(3.00);

        ArrayList<Producto> productos = new ArrayList();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);

        Double total = 0.0;
        Double precioMaximo = 0.00;
        for(int i = 0; i < productos.size(); i++)
        {
            total += productos.get(i).getPrecio();
            if(precioMaximo < productos.get(i).getPrecio())
                precioMaximo = productos.get(i).getPrecio();
        }

        System.out.println("Total: " + total);
        System.out.println("Media: " + total / productos.size());
        System.out.println("Máximo: " + precioMaximo);
    }
}
