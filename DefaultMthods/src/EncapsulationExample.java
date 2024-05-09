
class Encap{
	private long id;
	private String name;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	}


public class EncapsulationExample {

	public static void main(String[] args) {
		Encap p=new Encap();
		p.setId(101);
		p.setName("sowmya");
		System.out.println(p.getId()+" "+p.getName());
	}

}
