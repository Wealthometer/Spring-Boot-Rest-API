package com.Wealthometer.store.mappers;

import com.Wealthometer.store.dtos.UserDto;
import com.Wealthometer.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
