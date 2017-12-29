package ouestfrance.julien.summarize.controller;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import ouestfrance.julien.summarize.client.JerseyClientGet;
import ouestfrance.julien.summarize.model.Info;
import ouestfrance.julien.summarize.model.ServeurEnum;

@Controller
public class MainController {

    private JerseyClientGet jerseyClient = new JerseyClientGet();

    private ObjectMapper mapper = new ObjectMapper();

    @RequestMapping("/")
    public String index(Model model) throws JsonParseException, JsonMappingException, IOException {
        Map<ServeurEnum, Info> map = new TreeMap<>();
        for (ServeurEnum serveur : ServeurEnum.values()) {
            String json = jerseyClient.getJson(serveur.getUrlInfo());
            Info info = extractInfo(json);
            map.put(serveur, info);
        }
        model.addAttribute("map", map);
        return "welcome";
    }

    private Info extractInfo(String json) throws JsonParseException, JsonMappingException, IOException {
        return mapper.readValue(json, Info.class);
    }

}
