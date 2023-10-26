package crowdfunding.crowdfunding.repository.mybatis;

import crowdfunding.crowdfunding.dto.ItemDTO;
import crowdfunding.crowdfunding.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MybatisItem implements ItemRepository {
    private final ItemMapper itemMapper;

    @Override
    public ItemDTO itemSave(ItemDTO itemDTO) {
        itemMapper.itemSave(itemDTO);
        return itemDTO;
    }
}
