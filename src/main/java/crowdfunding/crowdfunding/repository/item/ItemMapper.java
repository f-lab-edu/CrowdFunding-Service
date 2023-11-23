package crowdfunding.crowdfunding.repository.item;

import crowdfunding.crowdfunding.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ItemMapper {
    void itemSave(ItemDTO itemDTO);
    void itemImageSave(@Param("itemNum")int itemNum,
                       @Param("itemImageName") List<String> itemImageName);
}
