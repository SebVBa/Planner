/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers.Members;

import Controllers.Controller;
import Models.Members.Member;
import Models.Members.MemberList;
import Views.View;



/**
 *
 * @author jprod
 */
public class MemberController implements Controller<Member> {
    private MemberList list;
    private View view;
     
    public MemberController(View view) {
        list=MemberList.getInstance();
        this.view=view;
    }
    
    @Override
    public void insert(Member obj) {
        if (obj.isComplete()){
            this.list.insert(obj);
            this.readAll();
        }else{
            this.view.displayErrorMessage("Faltan datos");
        }
    }
    
    @Override
    public void update(Member obj) {
        if (obj.isComplete()){
            this.list.update(obj);
            this.readAll();
        }else{
            this.view.displayErrorMessage("Faltan datos");
        }
    }

    @Override
    public void delete(Member obj) {
        if (this.list.delete(obj)){
            this.readAll();
        }else{
            this.view.displayErrorMessage("El miembro no se encuentra registrado");
        }
    }

    @Override
    public void read(Object id) {
        Member member=this.list.search(id);
        if (member!=null){
            this.view.display(member);
        }else{
            this.view.displayErrorMessage("El miembro buscado no se encuentra registrado");
        }
    }

    @Override
    public void readAll() {
        Member[] members=this.list.toArray();
        if (members.length>0){
            this.view.displayAll(members);
        }
    }
}
