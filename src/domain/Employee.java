package domain;

import java.io.Serializable;
import javax.persistence.*;
import java.util.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
@Entity
@Table(name="employee_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
@DiscriminatorColumn(name="emp_type",discriminatorType=DiscriminatorType.INTEGER)
@DiscriminatorValue(value="1")
public class Employee implements Serializable{
	private static final long serialVersionUID = 48L;
	@Id @Column(name="emp_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	// 标识属性,id为主键
	private Integer id;
	// 员工用户名，用于登陆系统，用户名不可重复
	@Column(name="emp_name", nullable=false, length=50 , unique=true)
	private String name;
	// 员工真实姓名
	@Column(name="emp_realname", nullable=false, length=50)
	private String realname;

	// 员工密码
	@Column(name="emp_pass", nullable=false, length=50)
	private String pass;
	// 员工工资
	@Column(name="emp_salary")
	private double salary;
	// 员工对应的经理，多个员工对应一个经理，采用非连接表，在mgr_id列记住员工的经理ID
	@ManyToOne(targetEntity=Manager.class)
	@JoinColumn(name="mgr_id")
	private Manager manager;
	// 员工对应的出勤记录，一个员工对应多个出勤记录，而一个出勤记录只属于一个员工
	@OneToMany(targetEntity=Attend.class, mappedBy="employee")
	private Set<Attend> attends = new HashSet<>();
	// 员工对应的工资支付记录，一个员工对应多次工资支付记录，一个工资支付记录只属于一个员工
	@OneToMany(targetEntity=Payment.class, mappedBy="employee")
	private Set<Payment> payments = new HashSet<>();

	// 无参数的构造器
	public Employee()
	{
	}
	// 初始化全部成员变量的构造器
	public Employee(Integer id , String name , String pass ,
		double salary , Manager manager ,
		Set<Attend> attends , Set<Payment> payments)
	{
		this.id = id;
		this.name = name;
		this.pass = pass;
		this.salary = salary;
		this.manager = manager;
		this.attends = attends;
		this.payments = payments;
	}

	// id的setter和getter方法
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	// pass的setter和getter方法
	public void setPass(String pass)
	{
		this.pass = pass;
	}
	public String getPass()
	{
		return this.pass;
	}
	
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}

	// salary的setter和getter方法
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}

	// manager的setter和getter方法
	public void setManager(Manager manager)
	{
		this.manager = manager;
	}
	public Manager getManager()
	{
		return this.manager;
	}

	// attends的setter和getter方法
	public void setAttends(Set<Attend> attends)
	{
		this.attends = attends;
	}
	public Set<Attend> getAttends()
	{
		return this.attends;
	}

	// payments的setter和getter方法
	public void setPayments(Set<Payment> payments)
	{
		this.payments = payments;
	}
	public Set<Payment> getPayments()
	{
		return this.payments;
	}
	// 根据name、pass来重写hashCode()方法
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}
	// 根据name、pass来重写equals()方法，只要name、pass相同的员工即认为相等。
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Employee other = (Employee) obj;
		if (name == null)
		{
			if (other.name != null) return false;
		}
		else if (!name.equals(other.name)) return false;
		if (pass == null)
		{
			if (other.pass != null) return false;
		}
		else if (!pass.equals(other.pass)) return false;
		return true;
	}
}
