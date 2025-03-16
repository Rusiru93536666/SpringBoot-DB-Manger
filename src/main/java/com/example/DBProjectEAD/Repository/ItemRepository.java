package com.example.DBProjectEAD.Repository;

import com.example.DBProjectEAD.Model.ItemModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<ItemModel,Integer> {
}
