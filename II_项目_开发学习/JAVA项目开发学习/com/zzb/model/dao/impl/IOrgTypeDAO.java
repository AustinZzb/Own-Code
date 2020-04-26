package com.zzb.model.dao.impl;

import java.util.List;

import com.zzb.model.entity.OrgType;
/**
 * 封装数据增删改查基本操作
 * @author 张致邦
 *
 * 2020年2月26日-下午4:23:40
 */
public interface IOrgTypeDAO {
	
	public boolean add(OrgType orgType);
	
	public boolean remove(String orgTypeID);
	
	public boolean modify(OrgType orgType);
	
	public OrgType findById(String orgTypeId);
	
	public List<OrgType> findByLike(OrgType orgType);
	
}
