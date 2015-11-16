package com.luomisoft.api;

/**
 * Api响应结果的封装类
 * @author Lenovo(cswingbin)
 * @datetime 2015-11-16 15:08 GMT+8
 * @email 703998061qq.com
 */
public class ApiResponse<T> {
    private String event;       //返回码，0为成功
    private String msg;         //返回信息
    private T obj;              //单个对象
    private T objList;          //多个对象
    private int currentPage;    //当前页数
    private int pageSize;       //每页显示数量
    private int maxCount;       //总条数
    private int maxPage;        //总页数

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public T getObjList() {
        return objList;
    }

    public void setObjList(T objList) {
        this.objList = objList;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getMaxPage() {
        return maxPage;
    }

    public void setMaxPage(int maxPage) {
        this.maxPage = maxPage;
    }



    public ApiResponse(String msg, String event) {
        this.msg = msg;
        this.event = event;
    }
    public boolean isSuccess(){
        return event.equals("0");

    }

}
