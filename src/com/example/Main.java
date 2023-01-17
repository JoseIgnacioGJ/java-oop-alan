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

        double total = 0, totalStock = 0, precioMaximo = 0, precioMinimo = 0;

        int cantProductos = 0;

        for(int i = 0; i < productos.length; i++)
        {
            if(productos[i].getPrecio() != null && productos[i].getaLaVenta()){

                cantProductos += productos[i].getCantidad();

                total += productos[i].getPrecio();
                totalStock += productos[i].getPrecio() * productos[i].getCantidad();

                if(precioMaximo < productos[i].getPrecio())
                    precioMaximo = productos[i].getPrecio();

                if(i == 0)
                    precioMinimo = productos[i].getPrecio();
                else
                {
                    if(precioMinimo > productos[i].getPrecio())
                        precioMinimo = productos[i].getPrecio();
                }
            }

        }

        System.out.println("Total: " + total);
        System.out.println("Total stock: " + totalStock);
        System.out.println("Media: " + total / productos.length);
        System.out.println("Media stock: " + totalStock / cantProductos);
        System.out.println("Mínimo: " + precioMinimo);
        System.out.println("Máximo: " + precioMaximo);
    }
}
