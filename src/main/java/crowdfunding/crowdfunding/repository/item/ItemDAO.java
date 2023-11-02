package crowdfunding.crowdfunding.repository.item;

import crowdfunding.crowdfunding.dto.ItemDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ItemDAO  {
    private final ItemMapper itemMapper;

    public ItemDTO itemSave(ItemDTO itemDTO) {
        itemMapper.itemSave(itemDTO);
        return itemDTO;
    }
}
