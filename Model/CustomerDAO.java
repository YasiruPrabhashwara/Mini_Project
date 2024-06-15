package Model;

import Database.DBConnection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDAO {

    public boolean saveCustomer(Customer customer) {
        try {
            Statement statement = (Statement) DBConnection.getConnection();
            String query = "INSERT INTO customer (Name, NIC, Destination, PaymentMethod, SpecialRequest) " +
                           "VALUES ('" + customer.getFullName() + "', '" + customer.getNic() + "', '" + customer.getDestination() + "', '" + customer.getPaymentMethod() + "', '" + customer.getSpecialRequest() + "')";
            int rowsInserted = statement.executeUpdate(query);
            return rowsInserted > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
