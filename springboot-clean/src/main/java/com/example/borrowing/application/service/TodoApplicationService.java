package com.example.borrowing.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class TodoApplicationService {
    
    @Value("${book.service.url}")
    private String bookServiceUrl;
    
    private final RestTemplate restTemplate;
    
    @Autowired
    public TodoApplicationService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public boolean checkBookIsExist(Long bookId) {
        String url = bookServiceUrl + "/api/books/exists?bookId=" + bookId;
        try {
        	System.out.println(url);
            ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
           System.out.println(response.getBody());
            return response.getStatusCode().is2xxSuccessful();
        } catch (Exception e) {
            return false;
        }
    }

   
}
