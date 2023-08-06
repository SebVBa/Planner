/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Members;

import Models.List;
import java.util.HashMap;

/**
 *
 * @author jprod
 */
public class MemberList implements List<Member> {
    //Patron de diseño singleton
    private static MemberList membersList;
    
    public static MemberList getInstance(){
        if(membersList==null){
            membersList=new MemberList();
        }
        return membersList;
    }
    
    HashMap<String,Member> members;
    
    private MemberList() {
        this.members=new HashMap<>();
    }
 
    @Override
    public boolean insert(Member obj) {
        this.members.put(obj.getId(), obj);
        return true;
    }
    
    @Override
    public boolean update(Member obj) {
        return this.insert(obj);
    }

    @Override
    public boolean delete(Member obj) {
        obj=this.search(obj.getId());
        return this.members.remove(obj.getId(), obj);
    }

    @Override
    public Member search(Object id) {
        return this.members.get(id.toString());
    }

    @Override
    public Member[] toArray() {
        return this.members.values().toArray(new Member[0]);
    }
}
