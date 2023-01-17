package com.example;

public class Producto {
    private String nombre;
    private ProductoCategoria categoria;
    private Double precio;
    private Integer cantidad;
    private String descripcion;

    private Fabricante fabricante;

    private Boolean aLaVenta;

    public Producto() {}

    public Producto(String nombre, ProductoCategoria categoria, Double precio, Integer cantidad, String descripcion, Fabricante fabricante, Boolean aLaVenta) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.fabricante = fabricante;
        this.aLaVenta = aLaVenta;
    }

    public Fabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ProductoCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(ProductoCategoria categoria) {
        this.categoria = categoria;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean getaLaVenta() {
        return aLaVenta;
    }

    public void setaLaVenta(Boolean aLaVenta) {
        this.aLaVenta = aLaVenta;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", categoria=" + categoria +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                ", descripcion='" + descripcion + '\'' +
                ", fabricante=" + fabricante +
                ", aLaVenta=" + aLaVenta +
                '}';
    }
}
