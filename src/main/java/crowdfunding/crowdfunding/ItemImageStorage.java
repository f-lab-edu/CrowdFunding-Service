package crowdfunding.crowdfunding;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class ItemImageStorage {

    @Value("${file.dir}")
    private String itemImageDir;

    public String itemImagePath(String itemImageName){
        return itemImageDir+itemImageName;
    }

    public List<String> itemImageFiles(List<MultipartFile> multipartFile) throws IOException{
        List<String> imageList = new ArrayList<>();
        for(MultipartFile multiImage:multipartFile){
            if(!multiImage.isEmpty()){
                imageList.add(imageNameSetting(multiImage));
            }
        }
        return imageList;
    }

    public String imageNameSetting(MultipartFile multiImage) throws IOException {
        if(multiImage.isEmpty()){
            return null;
        }

        String itemImageName = multiImage.getOriginalFilename();
        String extension = imageExtension(itemImageName);
        String uuid = UUID.randomUUID().toString();

        String dbItemImageName = uuid+"."+extension;
        multiImage.transferTo(new File(itemImagePath(dbItemImageName)));
        return dbItemImageName;
    }
    private String imageExtension(String itemImageName){
        int lastIndex = itemImageName.lastIndexOf(".");
        return itemImageName.substring(lastIndex+1);
    }
}
