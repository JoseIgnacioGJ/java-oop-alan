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

        Producto productos[] = {p1, p2, p3, p4, p5};

        double total = 0, precioMaximo = 0;
        for(Producto p : productos)
        {
            total += p.getPrecio();
            if(precioMaximo < p.getPrecio())
                precioMaximo = p.getPrecio();
        }

        System.out.println("Total: " + total);
        System.out.println("Media: " + total / productos.length);
        System.out.println("Máximo: " + precioMaximo);
    }
}
