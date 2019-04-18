package us.aaron.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ItemController {

    @RequestMapping("/items")
    public List<Item> getAllItems() {

        List<Item> item = new ArrayList<>();
        int nextProductNumber = 0;

        item.add(new Item(nextProductNumber++,
                "Fortnite",
                0.99,
                true,
                "Fortnite is a Battle Royal game <br>Play against 99 other players in a 100 player death match, alone or with friends",
                "<img src =images/game1.jpg>"));
        item.add(new Item(nextProductNumber++,
                "Pool",
                35.25,
                true,
                "Classic Pool game online",
                "<img src =images/game2.jpg>"));
        item.add(new Item(nextProductNumber++,
                "Zumba",
                1.99,
                true,
                "Color Matching game",
                "<img src =images/game3.jpg>"));
        item.add(new Item(nextProductNumber++,
                "Mario Cart",
                59.99,
                true,
                "Newest Mario Cart racing game<br>Play with friends online in head to head races",
                "<img src =images/game4.jpg>"));
        return item;
    }
}
