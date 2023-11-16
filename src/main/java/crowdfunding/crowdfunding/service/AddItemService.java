package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.dto.ItemDTO;
import crowdfunding.crowdfunding.repository.item.ItemDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddItemService {
    private final ItemDAO itemDAO;

    public ItemDTO itemSave(ItemDTO itemDTO){
        return itemDAO.itemSave(itemDTO);
    }
}
