package API.model;

public class Rate {
    private String currency;
    private String code;
    private double mid;

    public String getCurrency() {
        return currency;
    }

    public String getCode() {
        return code;
    }

    public double getMid() {
        return mid;
    }

    @Override
    public String toString() {
        return "Rate{" +
                "currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid=" + mid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rate rate = (Rate) o;

        if (Double.compare(rate.mid, mid) != 0) return false;
        if (currency != null ? !currency.equals(rate.currency) : rate.currency != null) return false;
        return code != null ? code.equals(rate.code) : rate.code == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = currency != null ? currency.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        temp = Double.doubleToLongBits(mid);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
