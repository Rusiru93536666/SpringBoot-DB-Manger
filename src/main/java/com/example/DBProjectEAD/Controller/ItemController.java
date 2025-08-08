package com.example.DBProjectEAD.Controller;

import com.example.DBProjectEAD.Model.ItemModel;
import com.example.DBProjectEAD.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")


public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/addItems")
    public ItemModel saveItem(@RequestBody ItemModel itemModel){
        return itemService.saveItem(itemModel);
    }

    @GetMapping("/getItems")
    public List<ItemModel> getItems()
    {
        return itemService.getItem();
    }

    @GetMapping("/{id}")
    public ItemModel getItemById(@PathVariable int id) {
        return itemService.getItemById(id);
    }

    @PutMapping("/{id}")
    public ItemModel updateItem(@PathVariable int id, @RequestBody ItemModel itemModel) {
        return itemService.updateItem(id, itemModel);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable int id) {
        itemService.deleteItem(id);
    }
}
