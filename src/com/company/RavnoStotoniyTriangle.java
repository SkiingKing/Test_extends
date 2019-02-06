package com.company;

public class RavnoStotoniyTriangle extends Triangle {

    public RavnoStotoniyTriangle(int x) {
        super(x, x, x);
    }

    RavnoStotoniyTriangle r = new RavnoStotoniyTriangle(10);

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "RavnoStotoniyTriangle" + x;
    }

    @Override
    public int hashCode() {

        return 5 + r.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}