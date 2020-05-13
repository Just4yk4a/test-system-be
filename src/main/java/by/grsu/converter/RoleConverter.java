package by.grsu.converter;

import by.grsu.data.entity.RoleEntity;
import by.grsu.data.vo.RoleVO;

public class RoleConverter {

    public static RoleVO convert(RoleEntity workflowEntity) {
        return RoleVO.builder()
                .id(workflowEntity.getId())
                .name(workflowEntity.getName())
                .build();
    }

    public static RoleEntity convert(RoleVO roleVO) {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(roleVO.getId());
        roleEntity.setName(roleVO.getName());
        return roleEntity;
    }
}
