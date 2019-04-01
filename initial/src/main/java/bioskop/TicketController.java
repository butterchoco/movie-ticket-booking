package bioskop;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TicketController {

    @RequestMapping("/showing-seat")
    public String index() {
        return "show-seat";
    }

}