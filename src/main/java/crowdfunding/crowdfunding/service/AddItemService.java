package crowdfunding.crowdfunding.service;

import crowdfunding.crowdfunding.dto.ItemDTO;
import crowdfunding.crowdfunding.repository.item.ItemDAO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddItemService {
    private final ItemDAO itemDAO;

    public ItemDTO itemSave(ItemDTO itemDTO){
        return itemDAO.itemSave(itemDTO);
    }
    public void itemImageSave(@Param("itemNum")int itemNum,
                              @Param("itemImageName")List<String> itemImageName){
        itemDAO.itemImageSave(itemNum,itemImageName);
    }
}
