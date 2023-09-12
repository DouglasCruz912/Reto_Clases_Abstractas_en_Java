package org.douglas.preycto.mamiferos;

import org.douglas.preycto.mamiferos.abstracMamiferos.Caninos.*;
import org.douglas.preycto.mamiferos.abstracMamiferos.Felinos.*;
import org.douglas.preycto.mamiferos.abstracMamiferos.Mamifero;

public class EjemploMamiferos {
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("la sabana y los pastizales", 2f, 3f, 250f,
                "Panther leo", 30f, 74,11,114f);

        Mamifero guepardo = new Guepardo("África", 94f, 1.5f, 72f, "Acinonyx jubatus",
                2f, 130);

        Mamifero tigre = new Tigre("Selvas tropicales, pastizales, sabanas e incluso manglares",
                70f, 380f,360f,"Panthera tigris",7.5f, 65,"tigre de bengala");

        Mamifero lobo = new Lobo("Su hábitat varía desde los témpanos de hielo de Groenlandia a los desiertos de Arabia o las selvas de la India",
                85f, 1.6f,80f,"Canis lupus","Gris", 60f, 6,
                "Lobo gris");

        Mamifero perroPitbull = new Perro("La casa del dueño",50f, 48f,30f,"Canis lupus familiaris",
                "Marron y Blanco",1.2f,235);

        Mamifero leona = new Leon("la sabana y los pastizales", 1.8f, 2.8f, 225f,
                "Panther leo", 26f, 76,11,108f);


        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = tigre;
        mamiferos[3] = lobo;
        mamiferos[4] = perroPitbull;
        mamiferos[5] = leona;

        for (Mamifero animal : mamiferos) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumeroManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
        }

    }
}