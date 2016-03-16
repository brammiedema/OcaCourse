package nl.youngcapital.atm.datacontroller.export;

public interface CrudRepoInterface {
	
	
	public void update() throws Exception;
	
	public void read() throws Exception;
	
	public void delete() throws Exception;

	public void create(Object obj) throws Exception;
	
}
