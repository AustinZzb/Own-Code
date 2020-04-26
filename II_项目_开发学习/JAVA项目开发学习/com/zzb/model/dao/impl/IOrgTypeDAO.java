package com.zzb.model.dao.impl;

import java.util.List;

import com.zzb.model.entity.OrgType;
/**
 * ��װ������ɾ�Ĳ��������
 * @author ���°�
 *
 * 2020��2��26��-����4:23:40
 */
public interface IOrgTypeDAO {
	
	public boolean add(OrgType orgType);
	
	public boolean remove(String orgTypeID);
	
	public boolean modify(OrgType orgType);
	
	public OrgType findById(String orgTypeId);
	
	public List<OrgType> findByLike(OrgType orgType);
	
}
