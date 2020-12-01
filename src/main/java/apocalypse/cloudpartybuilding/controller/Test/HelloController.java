package apocalypse.cloudpartybuilding.controller.Test;

import apocalypse.cloudpartybuilding.util.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    @GetMapping("/test")
    public ModelAndView test() {
        // 创建返回数据
        List<Book> books = new ArrayList<>();
        Book b1 = new Book(1, "hangge.com", "hangge");
        Book b2 = new Book(2, "航歌", "hangge");
        books.add(b1);
        books.add(b2);
        // 创建并返回 ModelAndView
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books); // 设置返回的数据
        mv.setViewName("book.html"); //设置视图名
        return mv;
    }
}
