package com.winter.authorityManagementSystem.utils.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* 自定义转换器:字符串转date
* */
public class StringToDateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String source) {
        if(source == null){
            throw new RuntimeException("出发时间不能为空");
        }

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            return df.parse(source);
        } catch (ParseException e) {
            e.printStackTrace();
            throw new RuntimeException("字符串转日期出错!!!");
        }
    }
}
