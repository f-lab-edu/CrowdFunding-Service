package crowdfunding.crowdfunding.controller;

import crowdfunding.crowdfunding.dto.CreateUserDTO;
import crowdfunding.crowdfunding.dto.ItemDTO;
import crowdfunding.crowdfunding.repository.item.ItemDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/item")
public class ItemController {
    private final ItemDAO itemDAO;
    @GetMapping("/add")
    public String addItem(@ModelAttribute ItemDTO itemDTO){
        return "itemview/additem";
    }

    @PostMapping("/add")
    public String addItemComplete(@Valid @ModelAttribute ItemDTO itemDTO, BindingResult bindingResult,
                                  HttpServletRequest httpServletRequest){

        if(bindingResult.hasErrors()){
            return "itemview/additem";
        }

        log.info("itemInfo = {}",itemDTO);
        itemDAO.itemSave(itemDTO);
        return "redirect:/";
    }
}
