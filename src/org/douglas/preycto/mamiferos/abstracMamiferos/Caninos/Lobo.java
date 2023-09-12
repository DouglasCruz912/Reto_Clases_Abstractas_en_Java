package org.douglas.preycto.mamiferos.abstracMamiferos.Caninos;

public class Lobo extends Canino{

    private Integer numCamada;
    private String especieLobo;

    public Lobo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public Integer getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El lobo come luego de cazar su presa en manada triturando la carne y " +
                "los huesos de la presa con unos colmillos de un tamaño de " +
                this.tamanoColmillos + " cm";
    }

    @Override
    public String dormir() {
        return "El lobo " + this.color + " duerme en las cavernas del habitat " + this.habitat;
    }

    @Override
    public String correr() {
        return "El lobo con un peso " + this.peso + " kg y una altura de " + this.altura + " mts puede correr" +
                "hasta una velocidad 50 – 60 km/h";
    }

    @Override
    public String comunicarse() {
        return "Los lobos de la especie " + this.especieLobo + " al igual que otras se comunican entre ellos por medio de sus aullidos!";
    }
}
