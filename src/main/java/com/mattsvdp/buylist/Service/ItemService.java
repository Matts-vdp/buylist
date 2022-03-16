package com.mattsvdp.buylist.Service;

import java.util.ArrayList;
import java.util.List;

import com.mattsvdp.buylist.Model.Item;
import com.mattsvdp.buylist.Repo.ItemRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    private ItemRepo itemRepo;

    public List<Item> findAll() {
        List<Item> items = new ArrayList<>();
        itemRepo.findAll().forEach(it -> {
            items.add(it);
        });
        return items;
    }

    public Item findItem(int id){
        Item item = itemRepo.findById(id).orElse(null);
        return item;
    }

    public Item addItem(String name, int amount) {
        Item newItem = new Item(name, amount);
        return itemRepo.save(newItem);
    }
}
