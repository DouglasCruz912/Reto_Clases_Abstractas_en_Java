package org.douglas.preycto.mamiferos.abstracMamiferos.Felinos;

public class Tigre extends Felino{


    private String tigre;
    public Tigre(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, String tigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.tigre = tigre;
    }


    public String getTigre() {
        return tigre;
    }

    @Override
    public String comer() {
        return "los tigres " + this.tigre + " se alimentan y cazan todo tipo de animales con grandes garras de hasta " +
                this.tamanoGarras + " cm capaces de desgarrar todo a su paso";
    }

    @Override
    public String dormir() {
        return "Los tigres duermen solitarios en su habitat natural la " + this.habitat;
    }

    @Override
    public String correr() {
        return "Los tigres con una altura de " + this.altura + " cm, un largo de " + this.largo + " cm, y un peso de hasta " +
                this.peso + " kg, pueden correr hasta una velocidad de " + this.velocidad + " km/hra";
    }

    @Override
    public String comunicarse() {
        return "Los tigres al ser solitarios no se comunican mucho, excepto para aparease o advertir a algún tigre enemigo";
    }
}
