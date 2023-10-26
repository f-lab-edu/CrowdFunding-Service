package crowdfunding.crowdfunding.repository;

import crowdfunding.crowdfunding.dto.ItemDTO;

public interface ItemRepository {
    public ItemDTO itemSave(ItemDTO itemDTO);
}
