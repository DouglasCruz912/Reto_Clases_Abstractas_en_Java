package org.douglas.preycto.mamiferos.abstracMamiferos.Felinos;

public class Guepardo extends Felino{


    public Guepardo(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "Los Guepardos normalmente se alimentas de los animales que comparten su habitat natural " + this.habitat;
    }

    @Override
    public String dormir() {
        return "Los Guepardos duermen en cualquier parte confiados en su gran velocidad de hasta " + this.velocidad +
                " km/h para salvarse corriendo de cualquier amenaza";
    }

    @Override
    public String correr() {
        return "Con un peso de " + this.peso + " kg, un tamaño de " + this.altura + " cm de altura y un largo de " + this.largo + " cm, " +
                "los Guepardos corren hasta una velocidad de " + this.velocidad + " km/h";
    }

    @Override
    public String comunicarse() {
        return "Los Guepardos se comunican por medio de pequeños rugidos para comunicarse con sus crias";
    }
}
