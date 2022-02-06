package stepdefinitions;

import io.cucumber.java.en.Given;
import utilities.DBUtils;

import java.sql.SQLException;

public class DatabaseStepDefs {

    @Given("user connects to the database")
    public void user_connects_to_the_database() {
        DBUtils.createConnection();
    }
    @Given("user gets the {string} from {string} table")
    public void user_gets_the_from_table(String column, String table) {
//      Select * from tp_customer;
        String myDynamicQuery = "Select "+column+"from "+table;
        DBUtils.executeQuery(myDynamicQuery);
    }
    @Given("user reads all of the {string} column data")
    public void user_reads_all_of_the_column_data(String column) throws SQLException {
//        System.out.println( DBUtils.getResultset().getObject(column));
//       next() takes us to next row
        DBUtils.getResultset().next();
//      I am on row 1
//        This gives me the single object on that row
        Object columnData = DBUtils.getResultset().getObject(column);
        System.out.println(columnData);

//        Going to the next row
        DBUtils.getResultset().next();
//        Getting the data on that row
        Object columnData2=DBUtils.getResultset().getObject(column);
        System.out.println(columnData2);
    }
}
