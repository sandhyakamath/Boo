/**
 * 
 */
package com.godel.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.godel.domain.ContactGroup;

/**
 * @author Godel
 *
 */
public class ContactGroupMapper implements RowMapper<ContactGroup>{

	public ContactGroup mapRow(ResultSet rs, int num) throws SQLException {
		// TODO Auto-generated method stub
		ContactGroup grp = new ContactGroup();
		grp.setGrpId(rs.getInt("grpId"));
		grp.setGrpName(rs.getString("grpName"));
		
		return grp;
	}

}
