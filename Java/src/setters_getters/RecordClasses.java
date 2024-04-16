package setters_getters;

/*Java 17 Feature--Record classes
 * As setters and getters is very lenghty code 
 * Record classes is very easy to implement and creates private methods internally
 * 
 */


/*class Demo1
{
	private int empno;
	private String ename;
	private int esal;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "RecordClasses [empno=" + empno + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
}
public class RecordClasses
{
	public static void main(String[] args)
	{
		Demo1 r1=new Demo1();
		r1.setEmpno(10);
		r1.setEname("Java");
		r1.setEsal(120000);
		System.out.println(r1.getEname());
	}
}
*/



record Emp(int empno,String ename,int esal) {}
public class RecordClasses {
	public static void main(String[] args)
	{
		Emp e1=new Emp(10,"Java",120000);
		System.out.println(e1.esal());
	}
	

}
