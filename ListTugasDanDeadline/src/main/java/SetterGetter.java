/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yosef
 */
public class SetterGetter {
    //deklarasi atribut
    private String Username, Password, Nama, Semester, Matkul, Deadline, Status, Keterangan;
    
    //membuat setter
    protected void setUsername (String Username) {
        this.Username = Username;
    }
    protected void setPassword (String Password) {
        this.Password = Password;
    }
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    public void setSemester(String Semester) {
        this.Semester = Semester;
    }
    public void setMatkul(String Matkul) {
        this.Matkul = Matkul;
    }
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }
    public void setStatus(String Status){
        this.Status = Status;
    }
    public void setKeterangan(String Keterangan) {
        this.Keterangan = Keterangan;
    }
    
    //membuat getter
    protected String getUsername () {
        return Username;
    }
    protected String getPassword () {
        return Password;
    }
    public String getNama(){
        return Nama;
    }
    public String getSemester(){
        return Semester;
    }
    public String getMatkul(){
        return Matkul;
    }
    public String getDeadline() {
        return Deadline;
    }
    public String getStatus() {
        return Status;
    }
    public String getKeterangan(){
        return Keterangan;
    }
}
