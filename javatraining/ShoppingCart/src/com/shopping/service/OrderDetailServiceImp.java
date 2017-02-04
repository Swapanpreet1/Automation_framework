package com.shopping.service;

import com.shopping.dao.OrderDetailsDao;
import com.shopping.dao.OrderDetailsImpDao;
import com.shopping.dao.UserDaoImp;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by swapanpreetkaur on 2/3/17.
 */
public class OrderDetailServiceImp implements OrderDetailService{

    static OrderDetailsDao od1;
    static {
        od1 = new OrderDetailsImpDao();
    }

    static
    {
        if(od1==null) {
            od1 = new OrderDetailsImpDao() {
                @Override
                public void add_orderdetail(File odfile) throws FileNotFoundException, IOException, SQLException {
                    od1.add_orderdetail(odfile);
                }

                @Override
                public void delete_orderdetail(int id) throws SQLException {
                    od1.delete_orderdetail(id);
                }

                @Override
                public void update_orderdetail(int id, int quantity, double price, int prod_id, int order_id) throws SQLException {
                    od1.update_orderdetail(id, quantity, price, prod_id, order_id);
                }

                @Override
                public void display_orderdetail() throws SQLException {
                    od1.display_orderdetail(id);

                }

                @Override
                public void display_orderdetail(int id) throws SQLException {

                }
            }



