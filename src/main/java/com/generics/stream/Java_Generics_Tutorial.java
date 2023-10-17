package com.generics.stream;

import com.generics.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/rest")
public class Java_Generics_Tutorial {

    @Autowired
    private ApplicationUserRepository applicationUserRepository;

    @PostMapping("/filter")
    public void filter() {
        List<?> list = new ArrayList<>();
        list.add("123");
        list.forEach(System.out::println);
    }
}
