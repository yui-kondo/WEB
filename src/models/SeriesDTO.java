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
            name = "getAllSeries",
            query = "SELECT s FROM SeriesDTO AS s"
            )
})
@Table(name="tblSeries")
public class SeriesDTO {
    // プロパティ
    @Id
    @Column(name = "series_id")
    private int series_id;

    @Column(name = "series_name")
    private String series_name;

    public int getSeries_id() {
        return series_id;
    }

    public void setSeries_id(int series_id) {
        this.series_id = series_id;
    }

    public String getSeries_name() {
        return series_name;
    }

    public void setSeries_title(String series_name) {
        this.series_name = series_name;
    }
}
