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
    public List<ItemModel> getItems(@PathVariable int id)
    {
        return itemService.getItem(id);
    }
}
