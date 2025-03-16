package com.example.DBProjectEAD.Service;

import com.example.DBProjectEAD.Model.ItemModel;
import com.example.DBProjectEAD.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public ItemModel saveItem(ItemModel itemModel)
    {
        return itemRepository.save(itemModel);
    }

    public List<ItemModel> getItem()
    {
        return itemRepository.findAll();
    }
}
