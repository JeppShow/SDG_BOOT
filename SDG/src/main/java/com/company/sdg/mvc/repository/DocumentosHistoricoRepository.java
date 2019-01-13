/**
 * 
 */
package com.company.sdg.mvc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.sdg.mvc.entity.DocumentosHistoricoEntity;

/**
 * @author the_d
 *
 */
@Repository
public interface DocumentosHistoricoRepository extends CrudRepository<DocumentosHistoricoEntity,Integer>{

}
