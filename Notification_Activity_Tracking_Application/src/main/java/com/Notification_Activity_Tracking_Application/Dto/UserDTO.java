package com.Notification_Activity_Tracking_Application.Dto;

import lombok.Data;

import java.time.LocalDateTime;
@Data
public class UserDTO {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
