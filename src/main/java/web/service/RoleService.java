package web.service;

import web.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getByIdRole(int id);
    Role getByName (String role);
}