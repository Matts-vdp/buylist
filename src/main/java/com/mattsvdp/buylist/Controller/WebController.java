package com.mattsvdp.buylist.Controller;

import com.mattsvdp.buylist.Service.ItemService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WebController {
    @Autowired
    private ItemService itemService;

    @GetMapping("/")
    public String Index(Model model) {
        model.addAttribute("items", itemService.findAll());
        return "Index";
    }

    @PostMapping("/delete")
    public String Delete(int delete, Model model) {
        itemService.delItem(delete);
        return Index(model);
    }
    @PostMapping("/add")
    public String Add(String name, int amount, Model model) {
        itemService.addItem(name, amount);
        return "redirect:/";
    }
}
