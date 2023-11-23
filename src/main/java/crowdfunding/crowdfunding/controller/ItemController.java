package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.ItemImageStorage;
import crowdfunding.crowdfunding.SessionName;
import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.ItemDTO;
import crowdfunding.crowdfunding.dto.LoginDTO;
import crowdfunding.crowdfunding.repository.item.ItemDAO;
import crowdfunding.crowdfunding.service.AddItemService;
import crowdfunding.crowdfunding.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
    private final AddItemService addItemService;
    private final ItemImageStorage itemImageStorage;
    @GetMapping("/add")
    public String addItem(@ModelAttribute ItemDTO itemDTO){
        return "itemview/additem";
    }

    @PostMapping("/add")
    public String addItemComplete(@Valid @ModelAttribute ItemDTO itemDTO, BindingResult bindingResult,
                                  HttpServletRequest httpServletRequest) throws IOException {

        if(bindingResult.hasErrors()){
            return "itemview/additem";
        }

        HttpSession httpSession = httpServletRequest.getSession(false);
        String setMakerId = httpSession.getAttribute(SessionName.LOGIN).toString();

        itemDTO.setMakerId(setMakerId);

        addItemService.itemSave(itemDTO);
        List<String> itemImageName = itemImageStorage.itemImageFiles(itemDTO.getItemImageName());

        addItemService.itemImageSave(itemDTO.getItemNum(),itemImageName);
        log.info("itemInfo = {}",itemDTO);
        return "redirect:/";
    }
}
