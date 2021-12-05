package com.hirewheel.hirewheel.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId ;

    @Column(nullable = false, unique = true, length = 50)
    private String roleName ;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL}, mappedBy = "role")
    private Set<Users> userList ;

    public Role() {


    }

    public Role(int roleId, String roleName) {
        this.roleId = roleId;
        this.roleName = roleName;
    }


    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }


    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
