/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Members;

import Models.Entity;


/**
 *
 * @author jprod
 */
public class Member implements Entity {
    private String id;
    private String name;
    private String phone;
    private String email;
    private Role role;

    //Metodos de Acceso
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //Constructores   
    public Member(String id, String name, String phone, String email, Role role) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.role = role;
    }
    
    public Member(String id, String name, String email, Role role) {
        this(id,name,"",email,role);
    }
    
    public Member(String id) {
        this(id,"","","",Role.LIDER);
    }

    @Override
    public String toString() {
        return "Cedula=" + id + ", Nombre=" + name + ", Telefono=" + phone + ", Correo=" + email + ", Rol=" + role + '}';
    }

    @Override
    public boolean isComplete() {
        return !this.id.equals("") && !this.name.equals("") &&!this.email.equals("");
    }
    
    @Override
    public Object[] toArrayObject() {
        return new Object[]{this.id,this.name,this.phone,this.email,this.role.toString()};
    }
}
