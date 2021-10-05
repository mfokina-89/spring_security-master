package web.dao;

import web.model.Role;

import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();
    Role getByIdRole(int id);
    Role getByName (String role);
}