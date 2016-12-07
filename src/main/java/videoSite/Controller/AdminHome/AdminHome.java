package videoSite.Controller.AdminHome;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by root on 12/7/16.
 */
@Controller
@RequestMapping("/admin")
public class AdminHome {
    @RequestMapping
    public String adminPage(){
        return "admin";
    }
}
