package vo;

import java.io.Serializable;
import java.util.List;

public class EmpBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	
	//该bean封装的数据在MgrManagerImpl类的 public List<EmpBean> getEmpsByMgr(String mgr)中定义
	private String empName;
	private String empRealName;
	private double amount;



	public EmpBean()
	{
	}

	public EmpBean(String empName , String empRealName , double amount)
	{
		this.empName = empName;
		this.empRealName = empRealName;
		this.amount = amount;
	}


	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public String getEmpName()
	{
		return this.empName;
	}


	public String getEmpRealName() {
		return empRealName;
	}
	public void setEmpRealName(String empRealName) {
		this.empRealName = empRealName;
	}

	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}

}