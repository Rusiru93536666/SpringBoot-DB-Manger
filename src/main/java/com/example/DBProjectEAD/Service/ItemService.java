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

    public ItemModel getItemById(int id) {
        return itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found: " + id));
    }

    public ItemModel updateItem(int id, ItemModel updatedItem) {
        ItemModel existing = itemRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Item not found: " + id));
        existing.setItemName(updatedItem.getItemName());
        existing.setQty(updatedItem.getQty());
        existing.setPrice(updatedItem.getPrice());
        return itemRepository.save(existing);
    }

    public void deleteItem(int id) {
        if (!itemRepository.existsById(id)) {
            throw new RuntimeException("Item not found: " + id);
        }
        itemRepository.deleteById(id);
    }
}
