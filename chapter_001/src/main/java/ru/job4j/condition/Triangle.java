package ru.job4j.condition;

public class Triangle {

    private Point first;
    private Point second;
    private Point third;
    private double ab;
    private double ac;
    private double bc;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
        this.ab = this.first.distance(this.second);
        this.ac = this.first.distance(this.third);
        this.bc = this.second.distance(this.third);
    }

    /**
     * Метод вычисления периметра по длинам сторон.
     *
     * Формула.
     *
     * (ab + ac + bc) / 2
     */
    public double period() {
        return (this.ab + this.ac + this.bc) / 2;
    }

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * Формула.
     *
     * √ p *(p - ab) * (p - ac) * (p - bc)
     *
     * где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt().
     *
     * @return Вернуть площадь, если треугольник существует или -1.
     */
    public double area() {
        double rsl = -1;
        double p = this.period();
        if (this.exist()) {
            rsl = Math.sqrt(p * (p - this.ab) * (p - this.ac) * (p - this.bc));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.
     *
     * @return
     */
    private boolean exist() {
        if (this.ab + this.ac > this.bc && this.ab + this.bc > this.ac && this.ac + this.bc > this.ab){
            return true;
        }
        return false;
    }
}
