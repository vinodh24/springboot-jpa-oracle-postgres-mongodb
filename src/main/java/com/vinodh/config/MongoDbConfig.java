package com.vinodh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories("com.vinodh.mongodb.repository")
public class MongoDbConfig {

}
