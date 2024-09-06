package com.microservicios.store.modelos;

public class Store {
    private Celular cel;

    private Integer cantidad;

    public Store() {
    }

    public Store(Celular c, int i) {
        this.cel = c;
        this.cantidad = i;
    }

    public void setCel(Celular cel) {
        this.cel = cel;
    }

    public Celular getCel() {
        return cel;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getCantidad() {
        return cantidad;
    }
}
