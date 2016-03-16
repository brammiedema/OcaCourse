package nl.youngcapital.atm.datacontroller.export;

public class DatabaseHandler implements CrudRepoInterface{
	private static DatabaseHandler _dbh;
	

	private DatabaseHandler(){
		this._dbh = this;

	}
	
	public static DatabaseHandler getInstance(){
		if(_dbh == null){
			new DatabaseHandler();
		}
		return _dbh;
	}
	
	public void create(Object obj) throws Exception {
		
		
	}

	@Override
	public void update() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() throws Exception {
		// TODO Auto-generated method stub
		
	}
	

}
