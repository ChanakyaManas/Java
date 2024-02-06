package New;

public class Dept1 implements Cloneable{
	private int did;
	private String dname;
	private Store s;
	public int getDid() {
		return did;
	}
	public Dept1(int did, String dname, Store s) {
		super();
		this.did = did;
		this.dname = dname;
		this.s = s;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public Store getS() {
		return s;
	}
	public void setS(Store s) {
		this.s = s;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public Dept1(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept1 [did=" + did + ", dname=" + dname + ", s=" + s + "]";
	}
	public Object clone() {
	Dept1 d=null;
	try {
		d=(Dept1)super.clone();
	Store s=(Store) new Store(d.getS().getSid(),d.getS().getSname(),getS().getsLoc()).clone();
	d.setS(s);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	return d;
	}
}
