package com.project.perfectnumbers.controllers;

import com.project.perfectnumbers.services.PerfectNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PerfectNumbersController {

    @Autowired
    private PerfectNumbersService perfectNumberService;

    @GetMapping("/findPerfectNumbers")
    public String findPerfectNumbers(@RequestParam("start") int start,
                                     @RequestParam("end") int end,
                                     Model model) {
        model.addAttribute("perfectNumbers", perfectNumberService.findPerfectNumbersBetween(start, end));
        model.addAttribute("start", start);
        model.addAttribute("end", end);
        return "result";
    }
}
