package business;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entities.Location;
import repository.LocationRepository;

@Service
public class LocationBusiness {
	
	@Autowired
	LocationRepository repo;
	
	public Optional<Location> getLocation(Integer num){
		return repo.findById(num);
	}
} 