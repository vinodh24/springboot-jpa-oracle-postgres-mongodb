package com.vinodh.mongodb.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface GenericMongoDAO<T> extends MongoRepository<T, Long>{
   
    
}
