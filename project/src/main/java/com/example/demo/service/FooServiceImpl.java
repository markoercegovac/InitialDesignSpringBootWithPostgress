package com.example.demo.service;

import com.example.demo.model.Foo;
import com.example.demo.repository.FooRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FooServiceImpl implements FooService {

    private final FooRepository fooRepository;

    @Override
    public void test() {
        Foo foo=new Foo();
        foo.setName("Test");
        fooRepository.save(foo);
    }
}
