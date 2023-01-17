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

        Producto productos[] = new Producto[5];
        productos[0] = p1;
        productos[1] = p2;
        productos[2] = p3;
        productos[3] = p4;
        productos[4] = p5;

        double total = 0.0;
        double precioMaximo = 0.00;
        for(int i = 0; i < productos.length; i++)
        {
            total += productos[i].getPrecio();
            if(precioMaximo < productos[i].getPrecio())
                precioMaximo = productos[i].getPrecio();
        }

        System.out.println("Total: " + total);
        System.out.println("Media: " + total / productos.length);
        System.out.println("Máximo: " + precioMaximo);
    }
}
