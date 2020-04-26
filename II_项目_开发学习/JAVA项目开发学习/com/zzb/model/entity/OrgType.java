package com.zzb.model.entity;
/**
 * ����Ϊ���ݿ���ʵ����Ӧ��ʵ���࣬���ݿ���е����������������������
 * @author ���°�
 *
 * 2020��2��26��-����11:23:53
 */
public class OrgType {
	/**
	 *  ����������Ҫ�����ݿ���е�����
	 *  Source����	get��set����  toString���� 
	 *  			hashCode������equals�������в��޲ι���
	 */
	private String value_0 = null;
	private String value_1 = null;
	private String value_2 = null;
	
	public OrgType() {
		// TODO Auto-generated constructor stub
	}
	
	public OrgType(String value_0, String value_1, String value_2) {
		this.value_0 = value_0;
		this.value_1 = value_1;
		this.value_2 = value_2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value_0 == null) ? 0 : value_0.hashCode());
		result = prime * result + ((value_1 == null) ? 0 : value_1.hashCode());
		result = prime * result + ((value_2 == null) ? 0 : value_2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrgType other = (OrgType) obj;
		if (value_0 == null) {
			if (other.value_0 != null)
				return false;
		} else if (!value_0.equals(other.value_0))
			return false;
		if (value_1 == null) {
			if (other.value_1 != null)
				return false;
		} else if (!value_1.equals(other.value_1))
			return false;
		if (value_2 == null) {
			if (other.value_2 != null)
				return false;
		} else if (!value_2.equals(other.value_2))
			return false;
		return true;
	}

	public String getValue_0() {
		return value_0;
	}

	public void setValue_0(String value_0) {
		this.value_0 = value_0;
	}

	public String getValue_1() {
		return value_1;
	}

	public void setValue_1(String value_1) {
		this.value_1 = value_1;
	}

	public String getValue_2() {
		return value_2;
	}

	public void setValue_2(String value_2) {
		this.value_2 = value_2;
	}

	@Override
	public String toString() {
		return "OrgType [value_0=" + value_0 + ", value_1=" + value_1 + ", value_2=" + value_2 + "]";
	}

}
