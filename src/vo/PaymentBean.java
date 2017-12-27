package vo;

import java.io.Serializable;
/**
 * Description:
 * <br/>��վ: <a href="http://www.crazyit.org">���Java����</a>
 * <br/>Copyright (C), 2001-2016, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
public class PaymentBean implements Serializable
{
	private static final long serialVersionUID = 48L;
	private String payMonth;
	private double amount;

	// �޲����Ĺ�����
	public PaymentBean()
	{
	}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public PaymentBean(String payMonth , double amount)
	{
		this.payMonth = payMonth;
		this.amount = amount;
	}

	// payMonth��setter��getter����
	public void setPayMonth(String payMonth)
	{
		this.payMonth = payMonth;
	}
	public String getPayMonth()
	{
		return this.payMonth;
	}

	// amount��setter��getter����
	public void setAmount(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return this.amount;
	}

}