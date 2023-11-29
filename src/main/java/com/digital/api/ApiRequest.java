package com.digital.api;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.devtools.v116.network.model.Request;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public abstract class ApiRequest {
    protected String url;
    protected Re;
    private static final String SLASH = "/";



    public ApiRequest (String url){
        this.url= url;
        log.info("");

    }
    public String getEndpoint (String ... endpoints){
        StringBuilder endpoint = new StringBuilder();
        for (String end: endpoints){
            endpoint.append(end).append(SLASH);

        } return endpoint.substring(0, endpoint.length()-1);
    }
public String formatParamatres(HashMap<String, String> parameters){
        StringBuilder query= new StringBuilder("?");
        for (Map.Entry<String, String> entry : parameters.entrySet()){
            query.append(entry.getKey()+ "=" + entry.getValue() + "&");
        } return query.deleteCharAt(query.length()-1).toString();
}


}
