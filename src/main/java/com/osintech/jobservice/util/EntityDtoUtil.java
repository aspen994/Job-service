package com.osintech.jobservice.util;


import com.osintech.jobservice.dto.JobDto;
import com.osintech.jobservice.entity.Job;
import org.springframework.beans.BeanUtils;

public class EntityDtoUtil {
    public static JobDto toDto(Job job){
        JobDto dto = new JobDto();
        BeanUtils.copyProperties(job,dto);
        return  dto;
    }

    public static Job toEntity(JobDto dto){
        Job job = new Job();
        BeanUtils.copyProperties(dto,job);
        return job;
    }
}
