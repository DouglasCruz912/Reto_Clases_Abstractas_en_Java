package org.douglas.preycto.mamiferos.abstracMamiferos.Felinos;

public class Leon extends Felino{

    private Integer numeroManada;
    private Float potenciaRugidoDecibel;

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numeroManada, Float potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numeroManada = numeroManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Integer getNumeroManada() {
        return numeroManada;
    }

    public Float getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El leon caza en manadas de  hasta " + this.numeroManada + " y se alimenta de los animales que comparten su habitat natural las " + this.habitat;
    }

    @Override
    public String dormir() {
        return "Los leones duermen junto con su manada confiados en que nadie los molestara gracias a su gran tamaño "
                + "con una altura de " + this.altura + " cm, un largo de " + this.largo + " cm, y un peso de hasta "
                + this.peso + " kg";
    }

    @Override
    public String correr() {
        return "los leones pueden correr hasta una velocidad de " + this.velocidad + " km/hra";
    }

    @Override
    public String comunicarse() {
        return "Los leones se comunican con fuertes rugidos, con una potencia de hasta " + this.potenciaRugidoDecibel +
                " decibeles";
    }
}
