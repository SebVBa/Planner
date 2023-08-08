
package Models.task ;

import Models.Entity;
import Models.Members.Member;

/**
 *
 * @author sebas
 */
public class Task implements Entity{
    private int num;
    private String name;
    private String description;
    private String startDate;
    private String endDate;
    private boolean completed;
    private Member responsible;

    @Override
    public boolean isComplete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object[] toArrayObject() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Task(int num, String name, String description, String startDate, String endDate, Member responsible) {
        this.num = num;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = false;
        this.responsible = responsible;
    }

    public Task(int num, String name, String description, String startDate, String endDate) {
        this.num = num;
        this.name = name;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.completed = false;
        this.responsible = null;
    }

    public Task(int num) {
        this.num = num;
        this.name = "";
        this.description = "";
        this.startDate = "";
        this.endDate = "";
        this.completed = false;
        this.responsible = null;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Member getResponsible() {
        return responsible;
    }

    public void setResponsible(Member responsible) {
        this.responsible = responsible;
    }
    
    public void complete(){
        this.completed=true;
    }
    
}
