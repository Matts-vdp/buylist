package com.mattsvdp.buylist.Controller;

import java.util.List;

import com.mattsvdp.buylist.Model.Item;
import com.mattsvdp.buylist.Service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/api")
    public ResponseEntity<List<Item>> GetItems(){
        return new ResponseEntity<>(itemService.findAll(), HttpStatus.OK);
    }
    
}
