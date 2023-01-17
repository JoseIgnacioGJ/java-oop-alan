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
        p1.setaLaVenta(true);
        p1.setCantidad(5);

        p2.setPrecio(2.00);
        p2.setaLaVenta(true);
        p2.setCantidad(4);

        p3.setPrecio(null);
        p3.setaLaVenta(true);
        p3.setCantidad(9);

        p4.setPrecio(4.00);
        p4.setaLaVenta(false);
        p4.setCantidad(48);

        p5.setPrecio(3.00);
        p5.setaLaVenta(true);
        p5.setCantidad(7);

        Producto productos[] = {p1, p2, p3, p4, p5};

        double total = 0, totalStock = 0, precioMaximo = 0;
        int cantProductos = 0;

        for(Producto p : productos)
        {
            if(p.getPrecio() != null && p.getaLaVenta()){

                cantProductos += p.getCantidad();

                total += p.getPrecio();
                totalStock += p.getPrecio() * p.getCantidad();

                if(precioMaximo < p.getPrecio())
                    precioMaximo = p.getPrecio();
            }

        }

        System.out.println("Total: " + total);
        System.out.println("Total stock: " + totalStock);
        System.out.println("Media: " + total / productos.length);
        System.out.println("Media stock: " + totalStock / cantProductos);
        System.out.println("Máximo: " + precioMaximo);
    }
}
