/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.slot19;

/**
 *
 * @author Nghia
 */
public class CandidateList {

    private Candidate[] list;
    private int index;
    final int MAX = 100;

    public CandidateList() {
        this.list = new Candidate[MAX];
        this.index = 0;
    }

    public boolean add(Candidate cand) {
        boolean check = false;
        if (this.list != null && this.index < MAX) {
            int index = this.findIndexByID(cand.getId());
            if (index == -1) {
                this.list[this.index++] = cand;
                check = true;
            }
        }
        return check;
    }

    public int findIndexByID(String id) {
        int index = -1;
        for (int i = 0; i < this.index; i++) {
            if (this.list[i].getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void display() {
        if (this.index == 0) {
            System.out.println("List is empty!");
        } else {
            for (int i = 0; i < this.index; i++) {
                this.list[i].display();
            }
        }
    }

    public Candidate getCandidateInfo(String id) {
        Candidate cand = null;
        for (int i = 0; i < this.index; i++) {
            if (this.list[i].getId().equals(id)) {
                cand = this.list[i];
                break;
            }
        }
        return cand;
    }

    public boolean update(int index) {
        boolean check = false;
        if (index >= 0 && index < this.index) {
            this.list[index].update();
            check = true;
        }
        return check;
    }

    public boolean remove(int index) {
        boolean check = false;
        if (index >= 0 && index < this.index) {
            for (int i = index; i < this.index - 1; i++) {
                this.list[i] = this.list[i + 1];
            }
            this.index--;
            check = true;
        }
        return check;
    }

    public Candidate[] getList() {
        return list;
    }

    public void setList(Candidate[] list) {
        this.list = list;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
