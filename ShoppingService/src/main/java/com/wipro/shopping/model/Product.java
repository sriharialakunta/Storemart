package com.wipro.shopping.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private int id;
	
	private String prodname;
	
	private String proddescription;
	
	private float prodprice;
	
}
