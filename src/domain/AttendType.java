package domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="attend_type_inf")
@Cache(usage=CacheConcurrencyStrategy.READ_ONLY)
public class AttendType
	implements Serializable
{
	private static final long serialVersionUID = 48L;

	@Id @Column(name="type_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="type_name", nullable=false , length=50)
	private String name;

	@Column(name="amerce_amount", nullable=false)
	private double amerce;


	public AttendType()
	{
	}

	public AttendType(Integer id , String name , double amerce)
	{
		this.id = id;
		this.name = name;
		this.amerce = amerce;
	}


	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}


	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}


	public void setAmerce(double amerce)
	{
		this.amerce = amerce;
	}
	public double getAmerce()
	{
		return this.amerce;
	}
}