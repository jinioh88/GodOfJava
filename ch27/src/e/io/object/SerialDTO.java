package e.io.object;

import java.io.Serializable;

public class SerialDTO implements Serializable {
    static final long serialVersionUID=1L;
    private String bookName;
    private int bookOrder;
    private boolean bsetSeller;
    private long soldPerDay;
    private String bookType="IT";

    public SerialDTO(String bookName, int bookOrder, boolean bsetSeller, long soldPerDay) {
        super();
        this.bookName = bookName;
        this.bookOrder = bookOrder;
        this.bsetSeller = bsetSeller;
        this.soldPerDay = soldPerDay;
    }

    @Override
    public String toString() {
        return "SerialDTO{" +
                "bookName='" + bookName + '\'' +
                ", bookOrder=" + bookOrder +
                ", bsetSeller=" + bsetSeller +
                ", soldPerDay=" + soldPerDay +
                ", bookType='" + bookType + '\'' +
                '}';
    }
}
