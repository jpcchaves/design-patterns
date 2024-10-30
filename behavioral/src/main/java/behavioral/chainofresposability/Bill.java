package behavioral.chainofresposability;

public class Bill {
    private Integer value;
    private Bill next;

    public Bill() {
    }

    public Bill(Integer value) {
        this.value = value;
    }

    public Bill(Integer value, Bill next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Bill getNext() {
        return next;
    }

    public void setNext(Bill next) {
        this.next = next;
    }

    public void execute(Integer remaining) {

        if (remaining >= value) {

            int bills = remaining / value;

            remaining %= value;

        }
    }
}
