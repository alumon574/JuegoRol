package PJ;

public interface IDamageable {
    //Devuelve la vida máxima del personaje
    double maxHealth();

    //Devuelve el valor de vida actual
    double currentHealth();

    //Devuelve true si el daño es mayor o igual a la vida
    boolean isDead();

    //Aumenta el daño recibido
    void receivesDamage(double amount);

    //Disminuye el daño recibido. El daño mínimo es 0
    void heals(double amount);
}
