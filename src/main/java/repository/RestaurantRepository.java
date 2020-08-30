/*
 * Creation : 30 Aug 2020
 */
package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.RestaurantEntity;

@Repository
public interface RestaurantRepository extends JpaRepository<RestaurantEntity, Integer>{

    public List<RestaurantEntity> findByLocation(Integer location);  
}
