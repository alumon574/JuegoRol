package PJ.Race;

import PJ.Stat.Stat;

public abstract class Race {



    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    //Devuelve true si son la misma clase
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        return getClass() == obj.getClass();
    }

//Devuelve el nombre simple de la clase
    @Override
    public String toString() {
        return super.toString();
    }
}
