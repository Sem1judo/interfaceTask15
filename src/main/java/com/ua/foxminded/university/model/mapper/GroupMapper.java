package com.ua.foxminded.university.model.mapper;

import com.ua.foxminded.university.model.Group;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GroupMapper implements RowMapper<Group> {
    @Override
    public Group mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Group group = new Group();

        group.setGroupId(resultSet.getLong("group_id"));
        group.setName(resultSet.getString("group_name"));
        group.setFacultyId(resultSet.getLong("faculty_id"));

        return group;
    }
}
