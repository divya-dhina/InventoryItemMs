package com.cloudkitchen.inventoryitem_ms.repository;

import com.cloudkitchen.inventoryitem_ms.model.InventoryItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepository extends JpaRepository<InventoryItem, Long> {
}
