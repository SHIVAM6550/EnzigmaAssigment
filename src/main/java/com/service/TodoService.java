package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Todo.Todo;
import com.repository.TodoRepo;

@Service
public class TodoService {
	 @Autowired
	    private TodoRepo repo;

	 //   public List<Todo> getAllTodos() {
	 //       return repo.findAll();
	  //  }

	    public Todo createTodo(Todo todo) {
	        return repo.save(todo);
	    }

	    public Todo updateTodo(Long id, Todo updatedTodo) {
	        Todo todo = repo.findById(id).orElseThrow();
	        todo.setTitle(updatedTodo.getTitle());
	        todo.setCompleted(updatedTodo.isCompleted());
	        return repo.save(todo);
	    }

	    public void deleteTodo(Long id) {
	        repo.deleteById(id);
	    }

		public List<Todo> getAllTodos() {
			return repo.findAll();
			
		}
	}

