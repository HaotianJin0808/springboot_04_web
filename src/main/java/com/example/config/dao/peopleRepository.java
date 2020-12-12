package com.example.config.dao;

import com.example.config.entity.people;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface peopleRepository extends CrudRepository<people,Integer>{
}
