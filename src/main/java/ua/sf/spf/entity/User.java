package ua.sf.spf.entity;

import java.io.Serializable;

/**
 * Created by SupRas
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String login;
    private String password;

    public User(Integer id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}