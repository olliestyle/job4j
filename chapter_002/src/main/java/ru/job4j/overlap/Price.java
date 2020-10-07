package ru.job4j.overlap;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * POJO цена
 */

public class Price {

    public Price() {

    }

    public Price(Price toCopy) {
        this.productCode = toCopy.productCode;
        this.number = toCopy.number;
        this.depart = toCopy.depart;
        this.begin = toCopy.begin;
        this.end = toCopy.end;
        this.value = toCopy.value;
    }

    public Price(String productCode, int number, int depart, LocalDateTime begin, LocalDateTime end, long value) {
        this.productCode = productCode;
        this.number = number;
        this.depart = depart;
        this.begin = begin;
        this.end = end;
        this.value = value;
    }

    private long id;
    private String productCode;
    private int number;
    private int depart;
    private LocalDateTime begin;
    private LocalDateTime end;
    private long value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getDepart() {
        return depart;
    }

    public void setDepart(int depart) {
        this.depart = depart;
    }

    public LocalDateTime getBegin() {
        return begin;
    }

    public void setBegin(LocalDateTime begin) {
        this.begin = begin;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Price price = (Price) obj;
        return productCode == price.productCode
                && number == price.number
               && depart == price.depart
               && begin.equals(price.begin)
               && end.equals(price.end)
               && value == price.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productCode, number, depart, begin, end, value);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
