/**
 * 
 */
package com.company.sdg.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.sdg.mvc.entity.ParametrosEntity;

/**
 * @author the_d
 *
 */
@Repository
public interface ParametrosRepository extends CrudRepository<ParametrosEntity,Integer>{

}
