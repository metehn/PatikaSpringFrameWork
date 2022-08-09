package com.metehan.bean;


import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;


@Getter
@Setter
@Named(value = "cdiBean")
@ApplicationScoped
public class JsfBean {

    String patika;

    public JsfBean() {
        this.patika = "cdiBean";
    }
}
