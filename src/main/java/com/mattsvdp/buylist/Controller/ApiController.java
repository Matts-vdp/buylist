package com.mattsvdp.buylist.Controller;

import java.util.List;

import com.mattsvdp.buylist.Model.Item;
import com.mattsvdp.buylist.Service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/api")
    public ResponseEntity<List<Item>> getItems(){
        return new ResponseEntity<>(itemService.findAll(), HttpStatus.OK);
    }
    
    @PostMapping("/api")
    @ResponseBody
    public ResponseEntity<Item> addItem(@RequestParam String name, @RequestParam(required = false, defaultValue = "1") int amount) {
        Item newItem = itemService.addItem(name, amount);
        return new ResponseEntity<>(newItem, HttpStatus.CREATED);
    }
    @DeleteMapping("/api/{id}")
    @ResponseBody
    public ResponseEntity<Integer> addItem(@PathVariable int id) {
        itemService.delItem(id);
        return new ResponseEntity<Integer>(HttpStatus.ACCEPTED);
    }
}
