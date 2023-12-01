package com.digital.enums;

import lombok.Getter;
import org.apache.http.protocol.HTTP;

public class StatusCodes {




         @Getter
    private final int status;

    StatusCodes(int status){
        this.status=status;
    }

}
