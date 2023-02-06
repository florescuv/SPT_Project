package com.example.online_catalogue.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AlertDTO {

    private String title;
    private String message;
    private AlertType type = AlertType.NONE;

}
