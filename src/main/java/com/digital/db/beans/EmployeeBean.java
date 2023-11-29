package com.digital.db.beans;

import com.digital.db.db_utils.DBConnection;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.dbutils.BeanProcessor;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class EmployeeBean {

    private int emp_no;
    private String birth_date;
    private String first_name;
    private String last_name;
    private String gender;
    private String hire_date;

    public EmployeeBean(){}

    public static List<EmployeeBean> getAll() throws SQLException {
        String query = "SELECT * FROM employees";
        try(ResultSet resultSet = DBConnection.query(query)){
            return new BeanProcessor().toBeanList(resultSet, EmployeeBean.class);
        }
    }

    public static EmployeeBean getBy(String column, String value) throws SQLException {
        String query = "SELECT * FROM employees WHERE " + column + " = ?;";
        // ? -заполнитель для значения value
        ResultSet rs = DBConnection.query(query, value);
        if(!rs.next()) return null;
        return new BeanProcessor().toBean(rs, EmployeeBean.class);
        //функционал BeanProcessor заключается в преобразовании данных из ResultSet в объекты Java классов,
        // что полезно при работе с базой данных, когда нужно извлекать данные и преобразовывать их в объекты для дальнейшей обработки в приложении.
    }


    public static EmployeeBean createNewEmployee(EmployeeBean employeeBean,int expectedIndex) throws SQLException {
        String columns = getAllColumns(employeeBean);
        String values = getValuesPlaceholder(employeeBean);
        String insertQuery = "INSERT INTO employees (" + columns + ") VALUES (" + values + ")";
        String retrieveQuery = "SELECT * FROM employees WHERE emp_no = " + expectedIndex;
        return DBConnection.insertAndRetrieveBean(insertQuery, retrieveQuery, EmployeeBean.class, employeeBean.getEmp_no(), employeeBean.getBirth_date(), employeeBean.getFirst_name(), employeeBean.getLast_name(), employeeBean.getGender(), employeeBean.getHire_date());
    }

    public static EmployeeBean updateEmployee(int expectedIndex, Map<String, Object> updates) throws SQLException {
        if (updates == null || updates.isEmpty()) {
            throw new IllegalArgumentException("Updates map cannot be null or empty");
        }
        String updateQuery = "UPDATE employees SET " +
                updates.entrySet().stream()
                        .map(entry -> entry.getKey() + " = ?")
                        .collect(Collectors.joining(", ")) +
                " WHERE emp_no = ?";
        // Добавляем expectedIndex в конец списка параметров
        updates.put("emp_no", expectedIndex);
        return DBConnection.updateAndRetrieveBean(updateQuery, "SELECT * FROM employees WHERE emp_no = " + expectedIndex, EmployeeBean.class, updates.values().toArray());
    }

    public static EmployeeBean deleteEmployee( int expectedIndex) throws SQLException {
        String deleteQuery = "DELETE FROM  employees WHERE  emp_no = " + expectedIndex;
        String retrieveQuery = "SELECT * FROM employees";
        return  DBConnection.deleteBean(deleteQuery,retrieveQuery,EmployeeBean.class);
    }

    private static String getValuesPlaceholder(EmployeeBean employeeBean) {
        StringBuilder placeholders = new StringBuilder();
        Field[] fields = employeeBean.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            placeholders.append("?, ");
        }
        if (placeholders.length() > 0) {
            placeholders.setLength(placeholders.length() - 2);
        }

        return placeholders.toString();
    }


    private static String getAllColumns(EmployeeBean employeeBean) {
        StringBuilder columns = new StringBuilder();
        Field[] fields = employeeBean.getClass().getDeclaredFields();
        for (Field field : fields) {
            columns.append(field.getName()).append(", ");
        }
        if (columns.length() > 0) {
            columns.setLength(columns.length() - 2);
        }
        return columns.toString();
    }

    public static EmployeeBean getByNameLastName (String firstName, String lastName) throws SQLException {
        String query = "select * from employees where first_name = ? and last_name = ?";
        ResultSet resultSet = DBConnection.query(query,firstName,lastName);
        return resultSet.next() ? new BeanProcessor().toBean(resultSet,EmployeeBean.class) : null;
    }
    public EmployeeBean(ResultSet rs) throws SQLException {
        new BeanProcessor().populateBean(rs, this);
    }

}