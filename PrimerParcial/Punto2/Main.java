import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        ArrayList personajes = new ArrayList();
        Scanner scan = new Scanner(System.in);
        Boolean close = false;
        while(close == false){
            System.out.println("Escriba el nombre del personaje:");
            System.out.println("--------------------------------");
            String nombre = scan.nextLine();
            System.out.println("--------------------------------");
            System.out.println("Escriba el genero del personaje:");
            System.out.println("--------------------------------");
            String genero = scan.nextLine();
            System.out.println("--------------------------------");
            System.out.println("A continuación seleccionara un numero del 0 al 100 en cada estadistica:");
            System.out.println("--------------------------------");
            System.out.println("Vida:");
            System.out.println("--------------------------------");
            int vida = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Inteligencia:");
            System.out.println("--------------------------------");
            int inteligencia = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Fuerza:");
            System.out.println("--------------------------------");
            int fuerza = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Agilidad:");
            System.out.println("--------------------------------");
            int agilidad = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Aguante:");
            System.out.println("--------------------------------");
            int aguante = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Benevolencia:");
            System.out.println("--------------------------------");
            int benevolencia = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Malevolencia:");
            System.out.println("--------------------------------");
            int malevolencia = scan.nextInt();
            System.out.println("--------------------------------");
            System.out.println("Seleccione una clase:");
            System.out.println("--------------------------------");
            System.out.println("1. Heroe");
            System.out.println("2. Monstruo");
            System.out.println("3. Principe");
            System.out.println("4. Villano");
            int clase = scan.nextInt();
            switch (clase) {
                case 1:
                    if(benevolencia > 50){
                        Heroe HeroeVeterano = new HeroeVeterano(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(HeroeVeterano);
                    }
                    else{
                        Heroe HeroeNovato = new HeroeNovato(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(HeroeNovato);
                    }
                    System.out.println("Personaje Creado");
                    break;
                case 2:
                    if(malevolencia < benevolencia){
                        Monstruo MonstruoBueno = new MonstruoBueno(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(MonstruoBueno);
                    }
                    else{
                        Monstruo MonstruoMalo = new MonstruoMalo(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(MonstruoMalo);
                    }
                    System.out.println("Personaje Creado");
                    break;
                case 3:
                    if(inteligencia < 25){
                        Principe PrincipeBobo = new PrincipeBobo(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(PrincipeBobo);
                    }
                    else{
                        Principe PrincipeListo = new PrincipeListo(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(PrincipeListo);
                    }
                    System.out.println("Personaje Creado");
                    break;
                case 4:
                    if(malevolencia > 50){
                        Villano PrincipeBobo = new GranVillano(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(PrincipeBobo);
                    }
                    else{
                        Villano PrincipeListo = new PequeñoVillano(nombre, genero, vida, inteligencia, fuerza, agilidad, aguante, benevolencia, malevolencia);
                        personajes.add(PrincipeListo);
                    }
                    System.out.println("Personaje Creado");
                    break;
                default:
                    System.out.println("Opcion de clase no permitida");
                    break;
            }
            System.out.println("1. Crear personaje");
            System.out.println("2. Ver lista personajes");
            int closeNum = scan.nextInt();
            if(closeNum == 2){
                close = true;
            }
        }
        System.out.println("Lista personajes:");
        for(int i = 0; i < personajes.size() ; i++){
            System.out.println((i+1) + " " + personajes.get(i).getClass().getName());
        }
        
    }
}
