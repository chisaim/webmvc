package home.pb.springwebmvc.model;

import java.io.Serializable;
import java.util.List;

public class Pages<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private boolean success;

    private String msg;

    private Integer status;

    private int total;

    private List<T> rows;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
