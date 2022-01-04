package imagereaderdb;

import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class MySQL 
{

   static  String url="jdbc:sqlserver://127.0.0.1\\SQLExpress;database=AdventureWorks";
        
    public static String[] getPhotos() 
    {
        ArrayList<String> list=null;
        
        try(Connection con=DriverManager.
                        getConnection(url,"sa","You need to insert your password in Microsofr SQL Server"))
        {
            String sql="Select id,name from dbo.pictures";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);           
            list=new ArrayList<>();
            while(rs.next())
               list.add(rs.getString(1)+" "+rs.getString(2));
        }
        catch(SQLException ex) { System.err.println(ex.getMessage()); }
        
        return list.toArray(new String[]{});
    }
    public static BufferedImage getPhoto(int id)
    {
        BufferedImage buf=null;
        InputStream in=null;
        
        try(Connection con=DriverManager.
                        getConnection(url,"sa","You need to insert your password in Microsofr SQL Server"))
        {
    
            String sql="Select photo from dbo.pictures where id=?";
            PreparedStatement pst=con.prepareStatement(sql);
            pst.setInt(1, id);
            ResultSet rs=pst.executeQuery();
            rs.next();
            in=rs.getBinaryStream(1); 
            buf=ImageIO.read(in);
        }
        catch(Exception ex) { System.err.println(ex.getMessage()); } 
        
        return buf; 
    }
}
