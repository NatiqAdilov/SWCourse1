class Circle<T extends Number> {
    private T radius;

    public Circle(T radius) {
        this.radius = radius;
    }

    public double getSahe() {
        double r = radius.doubleValue();
        return Math.PI * r * r;
    }

    public double getCevre() {
        double r = radius.doubleValue();
        return 2 * Math.PI * r;
    }
}