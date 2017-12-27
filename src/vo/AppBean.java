package vo;

import java.io.Serializable;

public class AppBean implements Serializable
{
	private static final long serialVersionUID = 48L;

	private int id;
	private String emp;
	private String unAttend;
	private String toAttend;
	private String reason;


	// �޲����Ĺ�����
	public AppBean()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public AppBean(int id , String emp , String unAttend
		, String toAttend , String reason)
	{
		this.id = id;
		this.emp = emp;
		this.unAttend = unAttend;
		this.toAttend = toAttend;
		this.reason = reason;
	}

	// id��setter��getter����
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}

	// emp��setter��getter����
	public void setEmp(String emp)
	{
		this.emp = emp;
	}
	public String getEmp()
	{
		return this.emp;
	}

	// unAttend��setter��getter����
	public void setUnAttend(String unAttend)
	{
		this.unAttend = unAttend;
	}
	public String getUnAttend()
	{
		return this.unAttend;
	}

	// toAttend��setter��getter����
	public void setToAttend(String toAttend)
	{
		this.toAttend = toAttend;
	}
	public String getToAttend()
	{
		return this.toAttend;
	}

	// reason��setter��getter����
	public void setReason(String reason)
	{
		this.reason = reason;
	}
	public String getReason()
	{
		return this.reason;
	}

}