package hqyj.success;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllerClass
{
    @ResponseBody
    @RequestMapping("/success")
    public String response()
    {
        return "xxx......";
    }
}
