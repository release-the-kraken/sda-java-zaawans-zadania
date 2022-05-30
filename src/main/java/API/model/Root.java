package API.model;

import java.util.ArrayList;

public class Root {
    private String table;
    private String no;
    private String effectiveDate;
    private ArrayList<Rate> rates;

    public String getTable() {
        return table;
    }

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    @Override
    public String toString() {
        return "Root{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Root root = (Root) o;

        if (table != null ? !table.equals(root.table) : root.table != null) return false;
        if (no != null ? !no.equals(root.no) : root.no != null) return false;
        if (effectiveDate != null ? !effectiveDate.equals(root.effectiveDate) : root.effectiveDate != null)
            return false;
        return rates != null ? rates.equals(root.rates) : root.rates == null;
    }

    @Override
    public int hashCode() {
        int result = table != null ? table.hashCode() : 0;
        result = 31 * result + (no != null ? no.hashCode() : 0);
        result = 31 * result + (effectiveDate != null ? effectiveDate.hashCode() : 0);
        result = 31 * result + (rates != null ? rates.hashCode() : 0);
        return result;
    }
}
