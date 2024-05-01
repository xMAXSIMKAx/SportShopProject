package ua.oneman.catalogservice.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;


    int xs;

    int s;

    int m;

    int l;

    int xl;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getXs() {
        return xs;
    }

    public void setXs(int xs) {
        this.xs = xs;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getXl() {
        return xl;
    }

    public void setXl(int xl) {
        this.xl = xl;
    }
}
