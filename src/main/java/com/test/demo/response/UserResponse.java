package com.test.demo.response;

import com.test.demo.model.UserModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String name;
    private String address;

    public static UserResponse from(UserModel userModel) {
        return UserResponse.builder()
                .id(userModel.getId())
                .name(userModel.getName())
                .address(userModel.getAddress())
                .build();
    }
}
