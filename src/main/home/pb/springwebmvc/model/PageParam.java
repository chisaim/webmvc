package home.pb.springwebmvc.model;

import java.io.Serializable;

public class PageParam implements Serializable{

    private static final long serialVersionUID = 1734516368014351348L;

    private int pageNo;

    private int  pageSize;

    private int offset;

    private String sort;

    private String orderBy;

    public PageParam(int pageSize, int offset, String sort, String orderBy) {
        super();
        this.pageNo =  offset / pageSize + 1;
        this.pageSize = pageSize;
        this.offset = offset;
        this.sort = sort;
        this.orderBy = orderBy;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }
}
