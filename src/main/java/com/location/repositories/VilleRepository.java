/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.location.repositories;

import com.location.entities.Ville;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author archie
 */
public interface VilleRepository extends CrudRepository<Ville, Long> {
    
}
