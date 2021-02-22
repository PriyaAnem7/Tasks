package com.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.springframework.context.annotation.Bean;

public class ApplicationConfig {
	
@Bean(name="cset")
	public Customer getCustomer()
{
	Customer c=new Customer();
	c.setCid("c1");
	c.setCname("maggie");
	c.setCmob(95959595);
	return c;
	}
@Bean(name="csetobj")
public Customer getCustomer1()
{
	Customer c=new Customer();
	c.setCid("c2");
	c.setCname("cheeku");
	c.setCmob(96969696);
	Address ad=new Address();
	ad.setHno(1);
	ad.setCity("gdr");
	c.setAdd(ad);
	return c;
	}
@Bean(name="setlist")
public Customer getCustomer2()
{
	Customer c=new Customer();
	c.setCid("c1");
	c.setCname("prathyu");
	c.setCmob(97979797);
	List<Item> i1=new LinkedList();
	Item a1=new Item();
	a1.setItemId(1);
	a1.setItemName("tv");
	a1.setItemPrice(20000);
	i1.add(a1);
	
	Item a2=new Item();
	a2.setItemId(1);
	a2.setItemName("bulb");
	a2.setItemPrice(10);
	i1.add(a2);
	c.setItem(i1);
	return c;

}

@Bean(name="conslist")
public Customer getCustomer5()
{
	Customer c=new Customer();
	c.setCid("c3");
	c.setCname("benu");
	c.setCmob(9999999);
	List<Item> a=new LinkedList();
	a.add(new Item(1,"sofa",10000));
	a.add(new Item(2,"chair",300));
	c.setItem(a);
	return c;
	
}
@Bean(name="cons")
public Customer getCustomer4()
{
	return new Customer("c10","sunitha",9393939);	
}
@Bean(name="consobj")
public Customer getCustomer5()
{
	return new Customer("c20","anu",9292929,new Address(132,"nlr"));	
}

}

