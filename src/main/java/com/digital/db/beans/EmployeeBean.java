package com.digital.db.beans;

import com.digital.db.db_utils.DBConnection;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.dbutils.BeanProcessor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Data
@AllArgsConstructor
public class EmployeeBean {

    private int emp_no;
    private String birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private String hire_date;

    public EmployeeBean() {
    }

    public static List<EmployeeBean> getAllEmployees() throws SQLException {
        String query = "SELECT * FROM employees";
        try (ResultSet resultSet = DBConnection.query(query)) {
            return new BeanProcessor().toBeanList(resultSet, EmployeeBean.class);
        }
    }

    public static EmployeeBean getBy(String column, String value) throws SQLException {
        String query = "SELECT * FROM employees WHERE " + column + " = ?;";
        // ? -заполнитель для значения value
        ResultSet rs = DBConnection.query(query, value);
        if(!rs.next()) return null;
        //next(), вы начинаете итерацию по этому набору данных, переходя от одной строки к другой
        // Вызывая next(), вы перемещаетесь к следующей записи и можете извлекать данные из нее
        return new BeanProcessor().toBean(rs, EmployeeBean.class);
        //функционал BeanProcessor заключается в преобразовании данных из ResultSet в объекты Java классов,
        // что полезно при работе с базой данных, когда нужно извлекать данные и преобразовывать их в объекты для дальнейшей обработки в приложении.
    }


    public static EmployeeBean getByNameLastName (String firstName, String lastName) throws SQLException {
        String query = "select * from employees where first_name = ? and last_name = ?";
        ResultSet resultSet = DBConnection.query(query,firstName,lastName);
        if (resultSet.next()) { // Перемещение к первой записи
            return new BeanProcessor().toBean(resultSet, EmployeeBean.class);
        } else {
            return null; // Возвращаем null, если записей нет
        }
    }
    //resultSet.next() -Проверка resultSet.next() не только помогает переместить указатель на первую запись,
    // но и проверяет наличие записей в результате запроса. Если метод next() вернет false, это означает,
    // что запрос вернул пустой результат, и вы можете вернуть null или выполнить другие действия в зависимости от вашей логики.
    //Если вы не используете resultSet.next(), указатель останется перед первой записью,
    // и при попытке извлечь данные с помощью new BeanProcessor().toBean(resultSet, EmployeeBean.class),
    // вы получите данные из пустого результата, что может привести к нежелательным результатам.
    // Поэтому использование resultSet.next() перед извлечением данных - это хорошая практика для обработки результатов запроса.





    public EmployeeBean(ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs, this);
    }

    public static EmployeeBean searchByFirstNameLastNameDate(String firstName, String lastName, String date) throws SQLException {
        // Добавляем кавычки и пробелы в SQL-запрос
        String query = "String query = SELECT * FROM employees WHERE first_name = ? AND last_name = ? AND hire_date = ?";

        ResultSet rs = DBConnection.query(query);
        if (!rs.next()) return null;

        return new BeanProcessor().toBean(rs, EmployeeBean.class);
    }

}