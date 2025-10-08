package com.example.borrowing.presentation.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.borrowing.application.service.TodoApplicationService;

@RestController
@RequestMapping("/api/borrowing")
@CrossOrigin(origins = "*")
public class BorrowingController {

    private final TodoApplicationService todoApplicationService;

    public BorrowingController(TodoApplicationService todoApplicationService) {
        this.todoApplicationService = todoApplicationService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> checkBookExists(
            @PathVariable Long id) {    
                System.out.println(id);
        boolean response = todoApplicationService.checkBookIsExist(id);
        return ResponseEntity.ok(response);
    }

   
}
