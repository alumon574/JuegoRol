package Character.Race;

import Character.Stat.Stat;

public abstract class Race {

    //Mis Stats empiezan en 10 asi que mis modificadores de raza sumaran 10 puntos

    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    //Devuelve true si son la misma clase
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

//Devuelve el nombre simple de la clase
    @Override
    public String toString() {
        return super.toString();
    }
}
