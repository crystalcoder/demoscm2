package com.mulbud.webwork;

import java.sql.ResultSet;

import com.mulbud.webwork.dataobjects.Product;

public class ProductReader implements ObjectReader<Product> {

	@Override
	public Product readFromResultSet(ResultSet rs) {
		
		  Product p = null;
		  try
		  {
			  p = new Product();
			  p.setId(rs.getInt("ProductId"));
			  p.setName(rs.getString("ProductName"));
			  p.setQuantityPerUnit(rs.getString("QuantityPerUnit"));
			  p.setUnitPrice(rs.getBigDecimal("unitPrice"));
		  }
		  catch(Exception ex)
		  {
			  ex.printStackTrace();
			  p = null;
		  }
		  // TODO Auto-generated method stub
		  return p;			
	}

}
