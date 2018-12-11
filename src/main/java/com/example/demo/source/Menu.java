package com.example.demo.source;

import java.util.List;

public class Menu {
    private String menuName;
    private List<Children> children;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }
}
