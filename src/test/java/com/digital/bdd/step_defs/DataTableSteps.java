package com.digital.bdd.step_defs;

import com.digital.models.UserPojo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableSteps {
    @DataTableType
    public UserPojo userEntry (Map<String,String> entry){
        return new UserPojo(
                entry.get("firstname"),
                entry.get("lastname"),
                entry.get("email")

        );

    }

    @Given("create new user with folliwing data")
    public void create_new_user_with_folliwing_data(DataTable user) {

        List<List<String>> users = user.asLists();

        System.out.println(users.get(2).get(1));

    }


    @Given("create new user with folliwing data pojo")
    public void create_new_user_with_folliwing_data_pojo(List<UserPojo> userPojoList) {

        for (UserPojo userPojo: userPojoList){
            System.out.println(userPojo.getFirstname());
            System.out.println(userPojo.getEmail());
        }

    }
}
