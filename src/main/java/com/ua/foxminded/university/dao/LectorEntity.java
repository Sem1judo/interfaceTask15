package com.ua.foxminded.university.dao;

import com.ua.foxminded.university.model.Lector;

import java.time.LocalDateTime;

public interface LectorEntity extends DaoEntity<Lector> {

     int getLessonsByTime(LocalDateTime start, LocalDateTime end);
}
