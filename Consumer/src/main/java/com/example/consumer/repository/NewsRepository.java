package com.example.consumer.repository;

import com.example.consumer.repository.entity.News;
import org.springframework.data.repository.CrudRepository;

public interface NewsRepository extends CrudRepository<News,Long> {
}
