package com.zzb.model.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.zzb.model.entity.OrgType;
import com.zzb.model.util.DBUtil;
/**
 * 实现数据增删改查操作
 * @author 张致邦
 *
 * 2020年2月26日-下午4:23:59
 */
public class IOrgTypeDAOImpl implements IOrgTypeDAO {

	@Override
	public boolean add(OrgType orgType) {
		// TODO Auto-generated method stub
		String value_0 = orgType.getValue_0();
		String value_1 = orgType.getValue_1();
		String value_2 = orgType.getValue_2();
		
		String sql = "insert into orgType(Value_0, Value_1, Value_2)"
					 + "values('" + value_0 + "','" + value_1 + "','" + value_2 + "')";
		System.out.println("add:" + sql);
		
		DBUtil dbUtil = new DBUtil();
		int n = dbUtil.update(sql);
		dbUtil.close();
		
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean remove(String orgTypeID) {
		// TODO Auto-generated method stub
		String sql = "delete from orgType where orgType = '" + orgTypeID +"'";
		System.out.println("remove" + sql);
		
		DBUtil dbUtil = new DBUtil();
		int n = dbUtil.update(sql);
		dbUtil.close();
		
		if(n>0)
			return true;
		return false;
	}

	@Override
	public boolean modify(OrgType orgType) {
		// TODO Auto-generated method stub
		String value_0 = orgType.getValue_0();
		String value_1 = orgType.getValue_1();
		String value_2 = orgType.getValue_2();
		
		String sql = "Update orgType Set Value_0 = '" + value_0 +"', Value_1 = '" + value_1 
					 + "', Value_2 = '" + value_2 + "' WHERE Value_0 = '" + value_0 + "'"; 
		System.out.println("modify" + sql);
		
		DBUtil dbUtil = new DBUtil();
		int n = dbUtil.update(sql);
		dbUtil.close();
		
		if(n>0)
			return true;
		return false;
	}

	@Override
	public OrgType findById(String orgTypeId) {
		// TODO Auto-generated method stub
		OrgType orgType = null;
		
		String sql = "select * from orgType where orgTypeId = '" + orgTypeId + "'";
		System.out.println(sql);
		
		DBUtil dbUtil = new DBUtil();
		ResultSet res = dbUtil.query("findById:" + sql);
		
		try {
			while(res.next()) {
				orgType = new OrgType();
				orgType.setValue_0(res.getString("Value_0"));
				orgType.setValue_1(res.getString("Value_1"));
				orgType.setValue_2(res.getString("Value_2"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			dbUtil.close();
		}
		
		return orgType;
	}

	@Override
	public List<OrgType> findByLike(OrgType orgType) {
		// TODO Auto-generated method stub
		List<OrgType> orgType_ans = new ArrayList<OrgType>();
		String value_0 = orgType.getValue_0();
		String value_1 = orgType.getValue_1();
		String value_2 = orgType.getValue_2();
		
		String sql = "select * from orgType where orgTypeId = '" + value_0 + "'";
		System.out.println(sql);
		
		DBUtil dbUtil = new DBUtil();
		ResultSet res = dbUtil.query(sql);
		orgType_ans.addAll(findByLike_(res));
		
		sql = "select * from orgType where orgTypeId = '" + value_1 + "'";
		System.out.println(sql);
		res = dbUtil.query(sql);
		orgType_ans.addAll(findByLike_(res));
		
		sql = "select * from orgType where orgTypeId = '" + value_2 + "'";
		System.out.println(sql);
		res = dbUtil.query(sql);
		orgType_ans.addAll(findByLike_(res));
		
		dbUtil.close();
		
		return orgType_ans;
	}
	
	private static List<OrgType> findByLike_(ResultSet rs) {
		List<OrgType> orgType_ans = new ArrayList<OrgType>();
		
		try {
			OrgType orgType = null;
			while(rs.next()) {
				orgType = new OrgType();
				orgType.setValue_0(rs.getString("Value_0"));
				orgType.setValue_1(rs.getString("Value_1"));
				orgType.setValue_2(rs.getString("Value_2"));
				orgType_ans.add(orgType);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return orgType_ans;
	}

}

















