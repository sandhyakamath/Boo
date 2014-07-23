/**
 * 
 */
package com.godel.DAO;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.godel.domain.ContactGroup;

/**
 * @author Godel
 *
 */
public class ContactGroupDAOImpl implements ContactGroupDAO{
	private  DataSource dataSource;
	private  JdbcTemplate jdbcTemplateObject;
	
	public  void setDataSource(DataSource ds)
	{
		this.dataSource = ds;
	    this.jdbcTemplateObject = new JdbcTemplate(ds);
	}
	
	public boolean addContactGrp(ContactGroup grp)
	{
		boolean retVal = false;
		try{
			String query = "insert into contactgroup (grpName) values (?)";
			jdbcTemplateObject.update(query, grp.getGrpName());	
			retVal = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return retVal;
	}
	public boolean isExists(int id)
	{
		ContactGroup grp = getContactGrp(id);
		if(grp!= null)
			return true;
		return false;
	}
	public boolean updateContactGrp(ContactGroup grp)
	{
		boolean retVal = false;
		try{
			String query = "update  contactgroup set grpName = ? where grpId = ? ";
			jdbcTemplateObject.update(query, grp.getGrpName(),grp.getGrpId());	
			retVal = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return retVal;		
	}
	public List<ContactGroup> contactGrp()
	{
		String query = "select * from contactgroup";
		List<ContactGroup> grpList = jdbcTemplateObject.query(query, new ContactGroupMapper());
		
		return grpList;
	}
	public boolean deleteContactGrp(int id)
	{
		boolean retVal = false;
		try{
			String query = "delete from contactgroup where grpId = ? ";
			jdbcTemplateObject.update(query,id);	
			retVal = true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return retVal;	
		
	}
	
	public ContactGroup getContactGrp(int id)
	{
		String query = "select * from contactgroup where grpId=?";
		ContactGroup grp = jdbcTemplateObject.queryForObject(query,new Object[]{id}, new ContactGroupMapper());
		
		return grp;
	}
	

}
