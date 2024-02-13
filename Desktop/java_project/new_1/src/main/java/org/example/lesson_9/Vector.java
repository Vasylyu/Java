package org.example.lesson_9;

public class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 1.0;
        this.y = 1.0;
        this.z = 1.0;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @return результат
     * @apiNote метод, вычисляющий длину вектора
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);


    }

    /**
     * @param vector2
     * @return результат
     * @apiNote метод вычисляющий скалярное произведение
     */
    public double scalar_product(Vector vector2) {
        return x * vector2.getX() + y * vector2.getY() + z * vector2.getZ();
    }

    /**
     * @param vector2
     * @return new vector3
     * @apiNote метод вычисляющий векторное произведение с другим вектрором
     */

    public Vector two_product(Vector vector2) {
        return new Vector(
                y * vector2.getZ() - z * vector2.getY(),
                z * vector2.getX() - x * vector2.getZ(),
                x * vector2.getY() - y * vector2.getX()
        );
    }

    /**
     * @param vector2
     * @return cos
     * @apiNote метод вычисляющий угол междк векторами(или косинс угла):
     * косинус угла равен скалярное произведение векторов, деленное на произведение модулей (длин) векторов
     */
    public double cos(Vector vector2) {
        return scalar_product(vector2) / (length() * vector2.length());
    }

    /**
     *
     * @param vector2
     * @return new Vector
     * @apiNote метод вычисляющий сумму векторов
     */
    public Vector sum(Vector vector2) {
        return new Vector(
                x + vector2.getX(),
                y + vector2.getY(),
                z + getZ());
    }

    /**
     *
     * @param vector2
     * @return new Vector
     * @apiNote метод вычисляющий разность векторов
     */
    public Vector difference(Vector vector2) {
        return new Vector(
                x - vector2.getX(),
                y - vector2.getY(),
                z - getZ());
    }
}
