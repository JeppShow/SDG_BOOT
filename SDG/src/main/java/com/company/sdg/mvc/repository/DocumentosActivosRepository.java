/**
 * 
 */
package com.company.sdg.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.sdg.mvc.entity.DocumentosActivosEntity;

/**
 * @author the_d
 *
 */
@Repository
public interface DocumentosActivosRepository extends CrudRepository<DocumentosActivosEntity,Integer>{

}
