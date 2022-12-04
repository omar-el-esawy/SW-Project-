package Data;

import service.Service;

public class ServiceStatePair {
	public Integer state;
	public Service service; 
	public ServiceStatePair(Integer state,Service service ){
		this.state = state;
		this.service = service;
	}

}
