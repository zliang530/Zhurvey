package com.zhenql.zhurvey.Questions;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Questions {

    @Id
    @GeneratedValue
    private long id;

    @Column(name="Questions")
    private String question;
}
