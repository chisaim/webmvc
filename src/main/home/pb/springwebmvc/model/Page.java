package home.pb.springwebmvc.model;

import java.io.Serializable;
import java.util.List;

public class Page implements Serializable {

    private static final long serialVersionUID = 1L;

    private int total;

    private List<Object> rows;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Object> getRows() {
        return rows;
    }

    public void setRows(List<Object> rows) {
        this.rows = rows;
    }
}
