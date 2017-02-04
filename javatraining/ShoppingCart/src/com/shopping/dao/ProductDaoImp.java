package com.shopping.dao;

import com.shopping.utils.DBConnection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by swapanpreetkaur on 2/3/17.
 */
public class ProductDaoImp implements ProductDao  {


    Connection con = DBConnection.getConnection();

    public void add_product(File pfile) throws FileNotFoundException,IOException ,SQLException {

        String insert_query= "insert into products (name,code, price ,stock) values (?,?,?,?)";

        File file2 = pfile;
        FileReader fr = new FileReader(file2);
        BufferedReader br = new BufferedReader(fr);

        String read;
        int i=0;
        String[] str = new String[3];

        while ((read = br.readLine()) != null) {
            str[i]=read;
            i++;
        }

        for (String s:str) {
            String[] s2 = s.split(",");

            PreparedStatement stmt = con.prepareStatement(insert_query);
            stmt.setString(1, s2[0]);
            stmt.setString(2, s2[1]);
            stmt.setString(3, s2[2]);
            stmt.setString(4, s2[3]);

            stmt.executeUpdate();
            stmt.close();

        }
        System.out.println(" Product added ");
        System.out.println();
    }

    @Override
    public void delete_product(int id) throws SQLException {

        String delete_query = "delete from products where id = ?";

        PreparedStatement ps = con.prepareStatement(delete_query);
        ps.setInt(1, id);
        ps.executeUpdate();

        System.out.println();
        System.out.println("Deleted product " +id+ " from product successfully");
        System.out.println();
        ps.close();

    }

    @Override
    public void update_product(int id, String name, String code, double price, int stock) throws SQLException {

    }

    public void update_product(int id, String name, String code, Double price, int stock) throws SQLException {

        String updateqry = "update products set name=?, code=?, price=?, stock=? where id = ?";

        PreparedStatement stmt1 = con.prepareStatement(updateqry);
        stmt1.setInt(1,id);
        stmt1.setString(2,name);
        stmt1.setString(3,code);
        stmt1.setDouble(4,price);
        stmt1.setInt(5,stock);
        stmt1.executeUpdate();

        System.out.println("Updated product " +id+ " successfull");
        System.out.println();
        stmt1.close();

    }

    public void display_product() throws SQLException{

        Statement stmt = null;
        String dispquery = "select * from products";
        stmt = con.createStatement();
        ResultSet result = stmt.executeQuery(dispquery);

        System.out.println("Display all the product table");

        while (result.next()) {
            int id = result.getInt(1);
            String name = result.getString(2);
            String code = result.getString(3);
            Double price = result.getDouble(4);
            int stock = result.getInt(5);

            System.out.println();
            System.out.println("Product_id: " +id+ "\tName: " +name+ "\tCode: " +code+ "\tPrice: " +price+ "\tStock: " +stock);


        }
        result.close();
        stmt.close();
    }

    public void display_productid(int id) throws SQLException {

        Statement stmt = null;
        String dispqry1 = "select * from products where id =" +id;
        stmt = con.createStatement();
        ResultSet result = stmt.executeQuery(dispqry1);

        System.out.println();
        System.out.println("Displaying product  details of userid " +id);

        while (result.next()) {
            int id1 = result.getInt(1);
            String name = result.getString(2);
            String code = result.getString(3);
            Double price = result.getDouble(4);
             int stock= result.getInt(5);

            System.out.println();
            System.out.println("Product_Id: " +id+ "\tName: " +name+ "\tCode: " +code+ "\tPrice: " +price+ "\tStock: "+stock);

        }
        result.close();
        stmt.close();
    }
}


