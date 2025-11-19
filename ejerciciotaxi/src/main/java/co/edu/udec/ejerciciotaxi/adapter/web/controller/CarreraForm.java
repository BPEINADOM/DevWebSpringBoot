package co.edu.udec.ejerciciotaxi.adapter.web.controller;

import lombok.Data;

@Data
public class CarreraForm {
    private String cliente;
    private String nombreTaxista;
    private String placaTaxi;
    private String modeloTaxi;

    private String barrioInicio;
    private String barrioLlegada;

    private double kilometros;
    private double precio;
    private int duracion;
    private int pasajeros;
}
