/**
 * 
 */
package com.godel.domain;

/**
 * @author Godel
 *
 */
public class Contact {
	
	private int cId;
	private String cName;
	private String cSex;
	private String cSountry;
	private int grpId;
	
	public Contact()
	{
		
	}
	
	public void setId(int id)
	{
		this.cId = id;
	}
	
	public int getId()
	{
		return this.cId;
	}
	
	public void setGrpId(int id)
	{
		this.grpId = id;
	}
	
	public int getGrpId()
	{
		return this.grpId;
	}
	
	public void setName(String name)
	{
		this.cName = name;
	}
	
	public String getName()
	{
		return this.cName;
	}
	
	public String getSex()
	{
		return this.cSex;
	}
	
	public void setSex(String sex)
	{
		this.cSex = sex;
	}
	
	public String getCountry()
	{
		return this.cSountry;
	}
	
	public void setCountry(String country)
	{
		this.cSountry = country;
	}

}
