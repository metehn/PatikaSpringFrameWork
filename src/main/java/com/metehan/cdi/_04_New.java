package com.metehan.cdi;

import com.metehan.StudentDto;
import jdk.jfr.Name;
import lombok.Getter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.New;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    //üretilen
    @Produces
    public String uretilenData(@New StudentDto studentDto) {

        studentDto = StudentDto.builder().studentId(0L).studentName("Metehan").studentSurname("Ersoy").build();
        return studentDto.getStudentName() + studentDto.getStudentSurname();
    }
    @Getter
    @Inject
    private  String uretilenData;

}
