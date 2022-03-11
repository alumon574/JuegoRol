package PJ.Job;

import PJ.Stat.Stat;

public abstract class Job {
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

