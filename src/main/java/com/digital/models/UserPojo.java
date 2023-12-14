package com.digital.models;

import io.cucumber.java.eo.Se;
import io.cucumber.java.mk_latn.No;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class UserPojo {
    private String firstname;
    private String lastname;
    private String email;



}
