package com.example.controller;

import com.example.config.pojo.Communication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.config.dao.communicationdao;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;

@Controller
public class peopleController {
    @Autowired
    communicationdao peopledao;

    @RequestMapping("/list.html")
    public  String list(Model model){
        Collection<Communication> people=communicationdao.getAll();
        model.addAttribute("peoples",people);
        return "list";
    }
    @GetMapping("/addperson")
    public String toAdd(){
        return "add";
    }

    @PostMapping("/add")
    public String addPerson(Communication person){
        peopledao.addPerson(person);

        return "redirect:/list.html";
    }
    @GetMapping("/updateperson/{id}")
    public String toUpdate(@PathVariable("id")Integer id,Model model){
        Communication person =peopledao.getPersonById(id);
        model.addAttribute("person",person);
        return "update";
    }
    @PostMapping("updateperson")
    public String updatePerson(Communication person){

        peopledao.addPerson(person);
        return"redirect:/list.html";
    }
    @GetMapping("/deleteperson/{id}")
    public String deletePerson(@PathVariable("id")Integer id){
        peopledao.deletePerson(id);
        return "redirect:/list.html";
    }

}
