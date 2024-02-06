package Object;

import java.util.Arrays;

public class Employee implements Cloneable{

	private int eid;
	private String ename;
	private double esal;
	private String edesg;
	private Dept dep;
	private Mobile[]m;


	public Employee(int eid, String ename, double esal, String edesg, Dept dep, Mobile[] m) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.edesg = edesg;
		this.dep = dep;
		this.m = m;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edesg=" + edesg + ", dep=" + dep
				+ ", m=" + Arrays.toString(m)+"]";
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public Dept getDep() {
		return dep;
	}
	public void setDep(Dept dep) {
		this.dep = dep;
	}
	public Mobile[] getM() {
		return m;
	}
	public void setM(Mobile[] m) {
		this.m = m;
	}
	public Employee clone() {
		Employee emp=null;
		try {
		emp=(Employee)super.clone();
		Dept  d=getDep().clone();
		setDep(d);
		}
		catch(CloneNotSupportedException e) {
			System.out.println(e);
		}
		return emp;
		
				
	}
	
	}
	

