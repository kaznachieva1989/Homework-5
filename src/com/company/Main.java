package com.company;

public class Main {

    public static void main(String[] args) {
	Heroe[] names = new Heroe[4];
	names[0] = new Heroe(250,20,"Physical");
	names[1] = new Heroe(250,20,"Magical");
	names[2] = new Heroe(250,20,"Kinetic");
	names[3] = new Heroe(100,0,"Medical");
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i].AttackTypes + " health: "
                    + names[i].Health + " наносимый урон: "
                    + names[i].Damages);
        }
    }
}
