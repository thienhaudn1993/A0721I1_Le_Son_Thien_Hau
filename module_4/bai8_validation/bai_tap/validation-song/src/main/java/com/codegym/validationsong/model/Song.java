package com.codegym.validationsong.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 1,max = 800, message = "kí tự tối đa 800")
    @Pattern(regexp = "^[a-z A-Z 0-9]+$",message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String name;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 1,max = 300, message = "kí tự tối đa 300")
    @Pattern(regexp = "^[a-z A-Z 0-9]+$",message = "Không chứa các kí tự đặc biệt như @ ; , . = - + , ….")
    private String singer;

    @NotEmpty(message = "Không được để trống")
    @Size(min = 1,max = 800, message = "kí tự tối đa 1000")
    @Pattern(regexp = "^[a-z A-Z 0-9 |,]+$",message = "Ngoại trừ dấu phẩy “,” , các ký tự đặc biệt còn lại không được phép")
    private String typeSong;

    public Song() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTypeSong() {
        return typeSong;
    }

    public void setTypeSong(String typeSong) {
        this.typeSong = typeSong;
    }
}
