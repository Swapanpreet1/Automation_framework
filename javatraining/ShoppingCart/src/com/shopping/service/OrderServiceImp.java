package com.shopping.service;


import com.shopping.dao.orderDao;
import com.shopping.dao.OrderDaoImp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by swapanpreetkaur on 2/3/17.
 */
public class OrderServiceImp implements OrderService
{

    {

        static orderDao od;


        static
        {
            if(od==null)
            {
                od=new OrderDaoImp();
            }

            System.out.println("calling Orders dao");
        }

    }
    @Override
    public void add_order(File ofile) throws FileNotFoundException, IOException, SQLException {
        od.add_order(ofile);
    }


    @Override
    public void delete_order(int id) throws SQLException {
        od.delete_order(id);
    }

    @Override
    public void update_order(int id, String name, String code, double price, int stock) throws SQLException {
        od.update_order(id,name,code,price,stock);
    }

    @Override
    public void dispaly_order_id(int id) throws SQLException {
        od.display_productid(id);
    }




    @Override
    public void display_product ()throws SQLException{
        od.display_product();
    }




}