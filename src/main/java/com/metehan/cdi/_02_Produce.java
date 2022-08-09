package com.metehan.cdi;


import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;


@Named(value = "producedtuto")
@ApplicationScoped
public class _02_Produce {


    @Produces
    public List<String> getList(){
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Android");
        list.add("Kotlin");
        list.add("Spring");

        return list;
    }

}
