/*
 * Creation : 30 Aug 2020
 */
package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.FoodEntity;

@Repository
public interface FoodRepository extends JpaRepository<FoodEntity, Integer> {

    public List<FoodEntity> findByIdIn(List<Integer> ids);
}
