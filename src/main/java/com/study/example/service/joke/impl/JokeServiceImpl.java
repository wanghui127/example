package com.study.example.service.joke.impl;

import com.study.example.entity.joke.Joke;
import com.study.example.mapper.joke.JokeMapper;
import com.study.example.service.joke.JokeService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class JokeServiceImpl  implements JokeService {
    @Resource
    JokeMapper jokeMapper;

    @Override
    public List<Joke> selectPage(Map<String, String> params) {
        return jokeMapper.selectPage(params);
    }
}
