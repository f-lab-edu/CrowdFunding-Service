package crowdfunding.crowdfunding.repository.mybatis;

import crowdfunding.crowdfunding.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    void itemSave(ItemDTO itemDTO);
}
