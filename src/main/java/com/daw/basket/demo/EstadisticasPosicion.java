package com.daw.basket.demo;

import lombok.Data;

@Data
public class EstadisticasPosicion {

    private String posicion;
    private Double numCanastas;
    private Integer maxCanastas;
    private Integer minCanastas;
    private Double numRebotes;
    private Integer maxRebotes;
    private Integer minRebotes;
    private Double numAsistencias;
    private Integer maxAsistencias;
    private Integer minAsistencias;

    public EstadisticasPosicion(String posicion, Double numCanastas, Double numRebotes, Double numAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.numRebotes = numRebotes;
        this.numAsistencias = numAsistencias;
    }

    public EstadisticasPosicion(String posicion, Double numCanastas, Integer maxCanastas, Integer minCanastas, Double numRebotes, Integer maxRebotes, Integer minRebotes, Double numAsistencias, Integer maxAsistencias, Integer minAsistencias) {
        this.posicion = posicion;
        this.numCanastas = numCanastas;
        this.maxCanastas = maxCanastas;
        this.minCanastas = minCanastas;
        this.numRebotes = numRebotes;
        this.maxRebotes = maxRebotes;
        this.minRebotes = minRebotes;
        this.numAsistencias = numAsistencias;
        this.maxAsistencias = maxAsistencias;
        this.minAsistencias = minAsistencias;
    }


//    public String getPosicion() {
//        return posicion;
//    }
//
//    public void setPosicion(String posicion) {
//        this.posicion = posicion;
//    }
//
//    public Double getNumCanastas() {
//        return numCanastas;
//    }
//
//    public void setNumCanastas(Double numCanastas) {
//        this.numCanastas = numCanastas;
//    }
//
//    public Double getNumRebotes() {
//        return numRebotes;
//    }
//
//    public void setNumRebotes(Double numRebotes) {
//        this.numRebotes = numRebotes;
//    }
//
//    public Double getNumAsistencias() {
//        return numAsistencias;
//    }
//
//    public void setNumAsistencias(Double numAsistencias) {
//        this.numAsistencias = numAsistencias;
//    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EstadisticasPosicion{");
        sb.append("posicion='").append(posicion).append('\'');
        sb.append(", numCanastas=").append(numCanastas);
        if (maxCanastas!= null) sb.append(", maxCanastas=").append(maxCanastas);
        sb.append(", minCanastas=").append(minCanastas);
        sb.append(", numRebotes=").append(numRebotes);
        sb.append(", maxRebotes=").append(maxRebotes);
        sb.append(", minRebotes=").append(minRebotes);
        sb.append(", numAsistencias=").append(numAsistencias);
        sb.append(", maxAsistencias=").append(maxAsistencias);
        sb.append(", minAsistencias=").append(minAsistencias);
        sb.append('}');
        sb.append(System.lineSeparator());
        return sb.toString();
    }
}
