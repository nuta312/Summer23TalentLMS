package com.digital.bdd.step_defs;

import com.digital.models.UserPojo;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTable_steps {

    @DataTableType
    public UserPojo userEntry(Map<String, String> entry){

        return new UserPojo(
                entry.get("firstname"),
                entry.get("lastname"),
                entry.get("email")
        );
    }

    @Given("fill up the fields with following data") // таблица в виде массива через индекс
    public void fill_up_the_fields_with_following_data(DataTable user) {

                List <List<String>> users = user.asLists();

        System.out.println(users.get(0).get(0));
    }

    @Given("create new user with following data pojo") // таблица ввиде объектов, и вызываем через объект
    public void create_new_user_with_following_data_pojo(List<UserPojo> userPojoList) {
for (UserPojo userPojo: userPojoList){
    System.out.println(userPojo.getFirstname());
    System.out.println(userPojo.getEmail());
}

    }
}
