import java.util.Objects;

public class Month {
    private int num;
    private int days;
    private String name;
    //add setters, getters, constructors, toString  

    public Month() {
    }

    public Month(int num, int days, String name) {
        this.num = num;
        this.days = days;
        this.name = name;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDays() {
        return this.days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Month num(int num) {
        setNum(num);
        return this;
    }

    public Month days(int days) {
        setDays(days);
        return this;
    }

    public Month name(String name) {
        setName(name);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Month)) {
            return false;
        }
        Month month = (Month) o;
        return num == month.num && days == month.days && Objects.equals(name, month.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, days, name);
    }

    @Override
    public String toString() {
        return "{" +
            " num='" + getNum() + "'" +
            ", days='" + getDays() + "'" +
            ", name='" + getName() + "'" +
            "}";
    }

}
