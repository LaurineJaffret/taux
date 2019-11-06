
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataSource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedago
 */
public class DAO {
    protected final DataSource myDataSource;
    
    public DAO(DataSource dataSource) {
		this.myDataSource = dataSource;
	}
    
    
    
    
    public int delete (int c) throws DAOExceotion {
        String sql = "DELETE FROM CUSTOMER WHERE CUSTOMER_ID = ?";
	try (  Connection connection = myDataSource.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql)
                ) {
		stmt.setInt(1, c);
			
		return stmt.executeUpdate();

	}  catch (SQLException ex) {
		Logger.getLogger("DAO").log(Level.SEVERE, null, ex);
		throw new DAOException(ex.getMessage());
		}
	}
    public int add (char c,int n) throws DAOExeption {
        
    } 
   
    
    
    
    
    
    
    
    
    
    
    
    
    
}
