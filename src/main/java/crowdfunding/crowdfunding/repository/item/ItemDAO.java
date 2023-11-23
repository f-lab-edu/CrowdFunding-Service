package crowdfunding.crowdfunding.repository.item;

import crowdfunding.crowdfunding.dto.ItemDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemDAO  {
    private final ItemMapper itemMapper;

    public ItemDTO itemSave(ItemDTO itemDTO) {
        itemMapper.itemSave(itemDTO);
        return itemDTO;
    }

    public void itemImageSave(@Param("itemNum") int itemNum,
                                 @Param("itemImageName") List<String> itemImageName){
        itemMapper.itemImageSave(itemNum,itemImageName);
    }
}
