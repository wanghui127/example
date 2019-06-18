package com.study.example.mapper.joke;

import com.study.example.entity.joke.Joke;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface JokeMapper {

    //分页查询所有数据
    List<Joke> selectPage(Map<String,String> params);
}
