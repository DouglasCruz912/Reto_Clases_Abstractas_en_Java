package org.douglas.preycto.mamiferos.abstracMamiferos.Caninos;

public class Perro extends Canino{

    private Integer fuerzaMordida;

    public Perro(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos, Integer fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public Integer getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los perros Pitbull desgarran la carne con una fuerza de mordida de " + this.fuerzaMordida + " psi y " +
                "con unos colmillos de " + this.tamanoColmillos + " cm";
    }

    @Override
    public String dormir() {
        return "Luego de comer los Pitbull duermen su siesta";
    }

    @Override
    public String correr() {
        return "Con un peso de "+ this.peso + " kg, un alto de " + this.altura + " cm, y un largo de " + this.largo
                + " cm, los perros Pitbull pueden correr a una velocidad de 57 kilómetros por hora";
    }

    @Override
    public String comunicarse() {
        return "Los perros Pitbull se comunican igual que otros perros ladrando y moviendo la cola";
    }
}
