package ua.sf.spf.entity;

import java.io.Serializable;

/**
 * Created by SupRas
 */
public class Result implements Serializable {

    private static final long serialVersionUID = 2L;

    private Integer id;
    private String login;
    private String time;

    public Result(Integer id, String login, String time) {
        this.id = id;
        this.login = login;
        this.time = time;
    }

    public Result() {
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getTime() {
        return time;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
