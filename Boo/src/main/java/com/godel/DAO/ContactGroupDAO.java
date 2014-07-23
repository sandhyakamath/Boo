/**
 * 
 */
package com.godel.DAO;

import java.util.List;

import javax.sql.DataSource;

import com.godel.domain.ContactGroup;

/**
 * @author Godel
 *
 */
public interface ContactGroupDAO {
	
	public  void setDataSource(DataSource ds);
	public boolean addContactGrp( ContactGroup grp);
	public boolean isExists(int id);
	public boolean updateContactGrp( ContactGroup grp); 
	public List<ContactGroup> contactGrp();
	public boolean deleteContactGrp(int id);
	public ContactGroup getContactGrp(int id);

}
