package com.mattsvdp.buylist.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.mattsvdp.buylist.Model.Item;

@Repository
public interface ItemRepo extends CrudRepository<Item, Integer>{
    
}
