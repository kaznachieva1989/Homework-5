package com.company;

public class MagicDoor {
    public static Heroe[] magicDoor() {
        Heroe h1 = new Heroe(250, 20, "Physical");
        Heroe h2 = new Heroe(250, 20, "Magical");
        Heroe h3 = new Heroe(250, 20, "Kinetic");
        Heroe h4 = new Heroe(100, 0, "Medical");

        Heroe[] heroes = {h1, h2, h3, h4};
        return heroes;
    }
}

// или еще один вариант,верно, нет?
/*public class MagicDoor {
    Heroe[] names = new Heroe[4];
    names[0] = new Heroe(250, 20, "Physical");
    names[1] = new Heroe(250, 20, "Magical");
    names[2] = new Heroe(250, 20, "Kinetic");
    names[3] = new Heroe(100, 0, "Medical");

        return names;
    }
}*/


