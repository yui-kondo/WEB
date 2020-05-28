package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(
            name = "getAllTune",
            query = "SELECT t FROM TuneDTO AS t"
            )
})
@Table(name="tblTune")
public class TuneDTO {
    // プロパティ
    @Id
    @Column(name = "tune_id")
    private int tune_id;

    @Column(name = "tune_name")
    private String tune_name;

    public int getTune_id() {
        return tune_id;
    }

    public void setTune_id(int tune_id){
        this.tune_id = tune_id;
    }

    public String getTune_name() {
        return tune_name;
    }

    public void setTune_title(String tune_name) {
        this.tune_name = tune_name;
    }
}
