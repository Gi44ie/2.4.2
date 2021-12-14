package web.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import web.model.Role;
import web.service.RoleService;
/*
*            Не используется в данной версии. Нужен для преобразования значений из чекбокса, если передавать объекты Role (не получилось реализовать)
*
* */
@Component
public class RoleConverter implements Converter<String, Role> {

    @Autowired
    private RoleService roleService;

    @Override
    public Role convert(String id) {
        return roleService.getRoleById(id);
    }
}
