package com.metehan.cdi;

import lombok.*;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Data
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {

    private Long namedId;
    private String namedData = "_01_Named";


}
