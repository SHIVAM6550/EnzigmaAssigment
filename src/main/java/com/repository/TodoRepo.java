package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Todo.Todo;
@Repository

public interface TodoRepo extends JpaRepository <Todo, Long>{

}
