package com.homeblog.model;

import com.homeblog.bo.Blog;
import com.homeblog.bo.User;

import java.util.List;

public class FanClass<T extends User,E extends Blog> {
    private User user;
    private List<E> tt;

    public List<E> getTt() {
        return tt;
    }

    public void setTt(List<E> tt) {
        this.tt = tt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "FanClass{" +
                ", user=" + user +
                ", tt=" + tt +
                '}';
    }
}
